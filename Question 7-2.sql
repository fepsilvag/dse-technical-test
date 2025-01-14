UPDATE SALESPERSON SET
  NAME = NAME || '*'
WHERE ID IN (
  SELECT
    S2.ID
  FROM SALESPERSON S2 
    INNER JOIN ORDERS O ON O.SALESPERSON_ID = S2.ID
  GROUP BY S2.ID
  HAVING COUNT(1) > 1
);