select * from empleados;
select * from departamentos;
select nombre_depto from departamentos;
select nombre, sal_emp from empleados;
select comision_emp from empleados;
select * from empleados WHERE cargo_emp = 'SECRETARIA';
select * from empleados WHERE cargo_emp = 'VENDEDOR' ORDER BY nombre;
select nombre, cargo_emp from empleados order by sal_emp;
select nombre_jefe_depto from departamentos where ciudad = 'CIUDAD REAL';
select nombre as Nombre, cargo_emp as Cargo from empleados;
select nombre, sal_emp, comision_emp from empleados where id_depto = 2000 order by comision_emp;
select nombre, sal_emp + comision_emp + 500 as TotalPagar from empleados where id_depto = 3000 order by nombre;
select nombre from empleados where nombre like 'J%';
select nombre, sal_emp as Salario, comision_emp as Comision, sal_emp + comision_emp as TotalPagar from empleados where comision_emp > 1000;
select nombre, sal_emp as Salario, comision_emp as Comision, sal_emp + comision_emp as TotalPagar from empleados where comision_emp = 0;
select nombre, sal_emp as Salario, comision_emp as Comision, sal_emp + comision_emp as TotalPagar from empleados where comision_emp > sal_emp;
select nombre, sal_emp as Salario, comision_emp as Comision, sal_emp + comision_emp as TotalPagar from empleados where comision_emp <= (sal_emp * 0.3);
select nombre from empleados where nombre not like '%MA%';
select nombre_depto, ciudad from departamentos where nombre_depto = 'Ventas' or nombre_depto = 'Investigación' or nombre_depto = 'Mantenimiento';
select nombre_depto, ciudad from departamentos where not (nombre_depto = 'Ventas' or nombre_depto = 'Investigación' or nombre_depto = 'Mantenimiento');
select max(sal_emp) from empleados;
select max(nombre) from empleados;
select max(sal_emp) as SalarioMaximo, min(sal_emp) as SalarioMinimo, max(sal_emp) -  min(sal_emp) as Diferencia  from empleados;
select avg(e.sal_emp), d.nombre_depto, d.ciudad from empleados e inner join departamentos d on e.id_depto = d.id_depto group by d.id_depto;
select count(e.id_emp), d.nombre_depto, d.ciudad from empleados e inner join departamentos d on e.id_depto = d.id_depto group by d.id_depto having count(e.id_emp) > 3;
select count(e.id_emp), d.nombre_depto, d.ciudad from departamentos d left join empleados e on e.id_depto = d.id_depto group by d.id_depto having count(e.id_emp) = 0;
select e.nombre, d.nombre_depto, d.nombre_jefe_depto from empleados e inner join departamentos d on e.id_depto = d.id_depto;
select nombre, sal_emp, id_depto from empleados where sal_emp >= (select avg(sal_emp) from empleados) order by id_depto;

select avg(sal_emp) from empleados;

/*
a) A continuación, realizar las siguientes consultas sobre la base de datos personal:
1. Obtener los datos completos de los empleados.
2. Obtener los datos completos de los departamentos.
3. Listar el nombre de los departamentos.
4. Obtener el nombre y salario de todos los empleados.
5. Listar todas las comisiones.
6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.
7. Obtener los datos de los empleados vendedores, ordenados por nombre
alfabéticamente.
8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a
mayor.
9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad
de “Ciudad Real”45
10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las
respectivas tablas de empleados.
11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado
por comisión de menor a mayor.
12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta
de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del
empleado y el total a pagar, en orden alfabético.
13. Muestra los empleados cuyo nombre empiece con la letra J.
14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos
empleados que tienen comisión superior a 1000.
15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen
comisión.
16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.
17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.
18. Hallar los empleados cuyo nombre no contiene la cadena “MA”
19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o
‘Mantenimiento.
20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni
“Investigación” ni ‘Mantenimiento.
21. Mostrar el salario más alto de la empresa.
22. Mostrar el nombre del último empleado de la lista por orden alfabético.
23. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
24. Hallar el salario promedio por departamento.
Consultas con Having
25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de
empleados de esos departamentos.
26. Hallar los departamentos que no tienen empleados
Consulta Multitabla (Uso de la sentencia JOIN/LEFT JOIN/RIGHT JOIN)
27. Mostrar la lista de empleados, con su respectivo departamento y el jefe de cada
departamento.
Consulta con Subconsulta
28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la
empresa. Ordenarlo por dep*/