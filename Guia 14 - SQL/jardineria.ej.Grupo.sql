
# 1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
select codigo_oficina, ciudad
from oficina;

# 2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
select ciudad, telefono, pais
from oficina
where pais = 'españa';

# 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
select nombre, apellido1, apellido2, email
from empleado
where codigo_jefe = 7;

# 4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
select puesto, nombre, apellido1, apellido2, email
from empleado
where codigo_jefe is null;

# 5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.
select nombre, apellido1, apellido2, puesto
from empleado
where puesto != 'representante ventas';

# 6. Devuelve un listado con el nombre de los todos los clientes españoles.
select nombre_cliente, pais
from cliente
where pais = 'spain';

# 7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
select distinct estado from pedido;

/*
8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago
en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan
repetidos. Resuelva la consulta:
	o Utilizando la función YEAR de MySQL.
	o Utilizando la función DATE_FORMAT de MySQL.
	o Sin utilizar ninguna de las funciones anteriores.
*/

select distinct codigo_cliente
from pago
where year(fecha_pago) = 2008;

select distinct codigo_cliente
from pago
where date_format(fecha_pago, '%Y') = 2008;

select distinct codigo_cliente
from pago
where fecha_pago like '%2008%';

select codigo_cliente
from pago
where fecha_pago >= '2008-01-01'
and  fecha_pago <= '2008-12-31'
group by codigo_cliente;

# 9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos que no han sido entregados a tiempo.
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega
from pedido
where fecha_esperada < fecha_entrega;
# or (isnull(fecha_entrega) and estado like 'Pendiente');

/*
10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha
esperada.
o Utilizando la función ADDDATE de MySQL.
o Utilizando la función DATEDIFF de MySQL.
*/

select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega
from pedido
where DATEDIFF(fecha_esperada, fecha_entrega) >= 2;

select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega
from pedido
where adddate(fecha_entrega, interval 2 day) <= fecha_esperada;


# 11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
select *
from pedido
where estado = 'rechazado' and year(fecha_entrega) = 2009;

# 12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.
select *
from pedido
where month(fecha_entrega) = 1;

# 13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal. Ordene el resultado de mayor a menor.
select *
from pago
where year(fecha_pago) = 2008 and forma_pago = 'paypal'
order by total desc;

# 14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en cuenta que no deben aparecer formas de pago repetidas.
select distinct forma_pago
from pago;

select forma_pago
from pago
group by forma_pago;

/* 15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que
tienen más de 100 unidades en stock. El listado deberá estar ordenado por su precio de
venta, mostrando en primer lugar los de mayor precio. */
select *
from producto
where gama = 'ornamentales' and cantidad_en_stock > 100
order by precio_venta desc;

# 16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo representante de ventas tenga el código de empleado 11 o 30.
select *
from cliente
where ciudad = 'madrid' and codigo_empleado_rep_ventas in(11, 30);

# Consultas multitabla (Composición interna)
# Las consultas se deben resolver con INNER JOIN.

# 1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.
select c.nombre_cliente as 'Cliente', e.nombre as 'Representante', e.apellido1 as 'Apellido', e.apellido2 as 'Apellido 2'
from cliente c
inner join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado;

# 2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.
select distinct c.nombre_cliente as 'Cliente', e.nombre as 'Representante', e.apellido1 as 'Apellido', e.apellido2 as 'Apellido 2'
from cliente c
join pago p on c.codigo_cliente = p.codigo_cliente
join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado;

# 3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.
select c.codigo_cliente, c.nombre_cliente as 'Cliente', e.nombre as 'Representante', e.apellido1 as 'Apellido', e.apellido2 as 'Apellido 2'
from cliente c
join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado
where c.codigo_cliente not in(select codigo_cliente from pago);


# 4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
select distinct c.nombre_cliente as 'Cliente', e.nombre as 'Representante', e.apellido1 as 'Apellido', e.apellido2 as 'Apellido 2', o.ciudad as 'Ciudad'
from cliente c
join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado
join pago p on c.codigo_cliente = p.codigo_cliente
join oficina o on o.codigo_oficina = e.codigo_oficina;

# 5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
select c.codigo_cliente, c.nombre_cliente as 'Cliente', e.nombre as 'Representante', e.apellido1 as 'Apellido', e.apellido2 as 'Apellido 2', o.ciudad as 'Ciudad'
from cliente c
join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado
join oficina o on o.codigo_oficina = e.codigo_oficina
where c.codigo_cliente not in(select codigo_cliente from pago);

# 6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
select distinct c.nombre_cliente as 'Cliente', c.ciudad as 'Ciudad', o.linea_direccion1 as 'Direccion oficina', o.linea_direccion2 as 'Direccion 2'
from cliente c
join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado
join oficina o on e.codigo_oficina = o.codigo_oficina
where c.ciudad = 'fuenlabrada';

# 7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
select distinct c.nombre_cliente as 'Cliente', e.nombre as 'Nombre Representante', e.apellido1 as 'Apellido', e.apellido2 as 'Apellido 2', o.ciudad as 'Ciudad de Oficina'
from cliente c
join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado
join oficina o on e.codigo_oficina = o.codigo_oficina;

# 8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
select e2.nombre as 'Empleado', e.nombre 'Jefe'
from empleado e
join empleado e2 on e.codigo_empleado = e2.codigo_jefe;

# 9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
select distinct c.nombre_cliente as 'Cliente', p.fecha_esperada, p.fecha_entrega, p.estado
from cliente c
join pedido p on c.codigo_cliente = p.codigo_cliente
where p.fecha_entrega > p.fecha_esperada;


# 10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
select distinct c.codigo_cliente, c.nombre_cliente, po.gama
from cliente c
join pedido p on c.codigo_cliente = p.codigo_cliente
join detalle_pedido d on p.codigo_pedido = d.codigo_pedido
join producto po on d.codigo_producto = po.codigo_producto
order by c.nombre_cliente;


SELECT c.nombre_cliente, GROUP_CONCAT(DISTINCT pr.gama SEPARATOR ', ') AS gamas
FROM cliente c
INNER JOIN pedido p ON c.codigo_cliente = p.codigo_cliente
INNER JOIN detalle_pedido dp ON p.codigo_pedido = dp.codigo_pedido
INNER JOIN producto pr ON dp.codigo_producto = pr.codigo_producto
GROUP BY c.nombre_cliente;


# Consultas multitabla (Composición externa)
# Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.

# 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
select *
from cliente c
left join pago p on c.codigo_cliente = p.codigo_cliente
where p.codigo_cliente is null;

# 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pedido.
select *
from cliente c
left join pedido p on c.codigo_cliente = p.codigo_cliente
where p.codigo_cliente is null;

# 3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que no han realizado ningún pedido.
select *
from cliente c
left join pago p on c.codigo_cliente = p.codigo_cliente
left join pedido pe on c.codigo_cliente = pe.codigo_cliente
where c.codigo_cliente not in(select codigo_cliente from pago)
and c.codigo_cliente not in (select codigo_cliente from pedido);

select * from cliente c 
left join pago p on c.codigo_cliente = p.codigo_cliente 
left join pedido p2 on c.codigo_cliente = p2.codigo_cliente 
where p2.codigo_cliente is null
and p.codigo_cliente is null;

# 4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina asociada.
select *
from empleado e
left join oficina o on e.codigo_oficina = o.codigo_oficina
where o.codigo_oficina is null;

# 5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente asociado.
select *
from empleado e
left join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas
where c.codigo_empleado_rep_ventas is null;

# 6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los que no tienen un cliente asociado.
select *
from empleado e
left join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas
left join oficina o on e.codigo_oficina = o.codigo_oficina
where c.codigo_empleado_rep_ventas is null
and o.codigo_oficina is null;

# 7. Devuelve un listado de los productos que nunca han aparecido en un pedido.
select *
from producto p
left join detalle_pedido d on p.codigo_producto = d.codigo_producto
where d.codigo_producto is null;

/* 8. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los
representantes de ventas de algún cliente que haya realizado la compra de algún producto
de la gama Frutales.*/

select distinct codigo_oficina
from oficina
where codigo_oficina not in(
	select distinct o.codigo_oficina
	from oficina o
	left join empleado e on o.codigo_oficina = e.codigo_oficina
	left join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas
	left join pedido p on c.codigo_cliente = p.codigo_cliente
	left join detalle_pedido d on p.codigo_pedido = d.codigo_pedido
	left join producto po on d.codigo_producto = po.codigo_producto
	where po.gama = 'frutales');


/*
select distinct o.codigo_oficina, po.gama
from oficina o
left join empleado e on o.codigo_oficina = e.codigo_oficina
left join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas
left join pedido p on c.codigo_cliente = p.codigo_cliente
left join detalle_pedido d on p.codigo_pedido = d.codigo_pedido
left join producto po on d.codigo_producto = po.codigo_producto
where po.gama = 'frutales';
*/

# 9. Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado ningún pago.
select *
from cliente c
left join pedido p on c.codigo_cliente = p.codigo_cliente
left join pago pa on c.codigo_cliente = pa.codigo_cliente
where pa.codigo_cliente is null;

/* 10. Devuelve un listado con los datos de los empleados que no tienen clientes asociados 
y el nombre de su jefe asociado.*/
select e.nombre, e.apellido1, e.apellido2, e.puesto, e2.nombre as 'Jefe'
from empleado e
left join empleado e2 on e.codigo_jefe = e2.codigo_empleado
left join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas
where c.codigo_empleado_rep_ventas is null;

# Consultas resumen
# 1. ¿Cuántos empleados hay en la compañía?
select count(*) as 'Cantidad de Empleados'
from empleado;

# 2. ¿Cuántos clientes tiene cada país?
select pais, count(*) as 'Cantidad de Clientes'
from cliente
group by pais;

# 3. ¿Cuál fue el pago medio en 2009?
select year(fecha_pago), round(avg(total))
from pago
where year(fecha_pago) = 2009
group by year(fecha_pago);

# 4. ¿Cuántos pedidos hay en cada estado? Ordena el resultado de forma descendente por el número de pedidos.
select estado, count(*) as 'Cantidad de Pedidos'
from pedido
group by estado
order by count(*) desc;

# 5. Calcula el precio de venta del producto más caro y más barato en una misma consulta.
select max(precio_venta), min(precio_venta)
from producto;

# 6. Calcula el número de clientes que tiene la empresa.
select count(*) as 'Cantidad de Clientes'
from empleado e
join cliente c on c.codigo_empleado_rep_ventas = e.codigo_empleado; 

# 7. ¿Cuántos clientes tiene la ciudad de Madrid?
select ciudad, count(*) as 'Cantidad de Clientes'
from cliente
where ciudad = 'madrid'
group by ciudad; 

# 8. ¿Calcula cuántos clientes tiene cada una de las ciudades que empiezan por M?
select ciudad, count(*) as 'Cantidad de Clientes'
from cliente
where ciudad like 'M%'
group by ciudad; 

# 9. Devuelve el nombre de los representantes de ventas y el número de clientes al que atiende cada uno.
select e.nombre as 'Representante', count(*) as 'Cantidad de Clientes'
from empleado e
join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas
group by e.nombre;

# 10. Calcula el número de clientes que no tiene asignado representante de ventas.
select count(*) as 'Clientes sin Representante'
from cliente c
left join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado
where e.codigo_empleado is null;

/* 11. Calcula la fecha del primer y último pago realizado por cada uno de los clientes. El listado
deberá mostrar el nombre y los apellidos de cada cliente.*/
select c.nombre_cliente, min(p.fecha_pago), max(p.fecha_pago)
from cliente c
join pago p on c.codigo_cliente = p.codigo_cliente
group by c.nombre_cliente;

# 12. Calcula el número de productos diferentes que hay en cada uno de los pedidos.
select codigo_pedido, count(codigo_producto)
from detalle_pedido
group by codigo_pedido;

# 13. Calcula la suma de la cantidad total de todos los productos que aparecen en cada uno de los pedidos.
select codigo_pedido, sum(cantidad)
from detalle_pedido
group by codigo_pedido;

/*14. Devuelve un listado de los 20 productos más vendidos y el número total de unidades que
se han vendido de cada uno. El listado deberá estar ordenado por el número total de
unidades vendidas.*/
select p.nombre, sum(d.cantidad)
from producto p
join detalle_pedido d on p.codigo_producto = d.codigo_producto
group by p.codigo_producto
order by sum(d.cantidad) desc
limit 20;

/* 15. La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el
IVA y el total facturado. La base imponible se calcula sumando el coste del producto por el
número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base
imponible, y el total la suma de los dos campos anteriores.*/


# 16. La misma información que en la pregunta anterior, pero agrupada por código de producto.
/* 17. La misma información que en la pregunta anterior, pero agrupada por código de producto
filtrada por los códigos que empiecen por OR.*/
18. Lista las ventas totales de los productos que hayan facturado más de 3000 euros. Se
mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21%
IVA)
Subconsultas con operadores básicos de comparación
1. Devuelve el nombre del cliente con mayor límite de crédito.
2. Devuelve el nombre del producto que tenga el precio de venta más caro.
3. Devuelve el nombre del producto del que se han vendido más unidades. (Tenga en cuenta
que tendrá que calcular cuál es el número total de unidades que se han vendido de cada
producto a partir de los datos de la tabla detalle_pedido. Una vez que sepa cuál es el código
del producto, puede obtener su nombre fácilmente.)
4. Los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. (Sin utilizar
INNER JOIN).
5. Devuelve el producto que más unidades tiene en stock.
6. Devuelve el producto que menos unidades tiene en stock.
7. Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto
Soria.
Subconsultas con ALL y ANY
1. Devuelve el nombre del cliente con mayor límite de crédito.
2. Devuelve el nombre del producto que tenga el precio de venta más caro.
3. Devuelve el producto que menos unidades tiene en stock.
Subconsultas con IN y NOT IN
1. Devuelve el nombre, apellido1 y cargo de los empleados que no representen a ningún
cliente.
2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
3. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
4. Devuelve un listado de los productos que nunca han aparecido en un pedido.
5. Devuelve el nombre, apellidos, puesto y teléfono de la oficina de aquellos empleados que
no sean representante de ventas de ningún cliente.
Subconsultas con EXISTS y NOT EXISTS
1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún
pago.
2. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
3. Devuelve un listado de los productos que nunca han aparecido en un pedido.
4. Devuelve un listado de los productos que han aparecido en un pedido alguna vez.
