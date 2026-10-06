WITH RECURSIVE
    vencimentos AS (
        SELECT
            empregado.matr,
            empregado.lotacao AS cod_dep,
            empregado.lotacao_div AS cod_divisao,
            sum(coalesce(vencimento.valor, 0)) AS vencimento_total
        FROM
            empregado
                LEFT JOIN emp_venc ON empregado.matr = emp_venc.matr
                LEFT JOIN vencimento ON emp_venc.cod_venc = vencimento.cod_venc
        GROUP BY
            empregado.matr,
            empregado.lotacao,
            empregado.lotacao_div
    ),

    descontos AS (
        SELECT
            empregado.matr,
            empregado.lotacao AS cod_dep,
            empregado.lotacao_div AS cod_divisao,
            sum(coalesce(desconto.valor, 0)) AS desconto_total
        FROM
            empregado
                LEFT JOIN emp_desc ON empregado.matr = emp_desc.matr
                LEFT JOIN desconto ON emp_desc.cod_desc = desconto.cod_desc
        GROUP BY
            empregado.matr,
            empregado.lotacao,
            empregado.lotacao_div
    ),

    salarios_liquidos AS (
        SELECT
            vencimentos.cod_dep,
            vencimentos.cod_divisao,
            vencimentos.vencimento_total
                - descontos.desconto_total AS salario_liquido
        FROM
            vencimentos
                INNER JOIN descontos ON vencimentos.matr = descontos.matr
    )

SELECT
    departamento.nome AS "Nome Departamento",
    count(*) AS "Numero de Empregados",
    case
        WHEN avg(salarios_liquidos.salario_liquido) = 0 THEN '0' ELSE
        round(avg(salarios_liquidos.salario_liquido), 2)
        end as "Media Salarial",
    case
        WHEN max(salarios_liquidos.salario_liquido) = 0 THEN '0' ELSE
        round(max(salarios_liquidos.salario_liquido), 2)
        end as "Maior Salario",
    case
        WHEN min(salarios_liquidos.salario_liquido) = 0 THEN '0' ELSE
        round(min(salarios_liquidos.salario_liquido), 2)
        end AS "Menor Salario"
FROM
    divisao
        INNER JOIN departamento ON divisao.cod_dep = departamento.cod_dep
        INNER JOIN salarios_liquidos
                   ON
                       departamento.cod_dep = salarios_liquidos.cod_dep
                           AND divisao.cod_divisao = salarios_liquidos.cod_divisao
GROUP BY
    divisao.cod_dep,
    departamento.nome
ORDER BY
    "Media Salarial" DESC;