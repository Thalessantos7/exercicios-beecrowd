WITH Vencimentos AS (
    SELECT
        ev.matr,
        COALESCE(SUM(v.valor), 0) AS total_venc
    FROM emp_venc ev
             INNER JOIN vencimento v ON ev.cod_venc = v.cod_venc
    GROUP BY ev.matr
),
     Descontos AS (
         SELECT
             ed.matr,
             COALESCE(SUM(d.valor), 0) AS total_desc
         FROM emp_desc ed
                  INNER JOIN desconto d ON ed.cod_desc = d.cod_desc
         GROUP BY ed.matr
     ),
     SalarioEmpregado AS (
         SELECT
             e.matr,
             e.lotacao_div,
             COALESCE(v.total_venc, 0) - COALESCE(d.total_desc, 0) AS salario
         FROM empregado e
                  LEFT JOIN Vencimentos v ON e.matr = v.matr
                  LEFT JOIN Descontos d ON e.matr = d.matr
     )
SELECT
    dep.nome AS departamento,
    div.nome AS divisao,
    ROUND(AVG(se.salario), 2) AS media,
    ROUND(MAX(se.salario), 2) AS maior
FROM departamento dep
         INNER JOIN divisao div ON dep.cod_dep = div.cod_dep
         INNER JOIN SalarioEmpregado se ON div.cod_divisao = se.lotacao_div
GROUP BY
    dep.cod_dep,
    dep.nome,
    div.cod_divisao,
    div.nome
ORDER BY
    media DESC;