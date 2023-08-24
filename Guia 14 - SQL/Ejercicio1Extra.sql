
/*
A continuación, se deben realizar las siguientes consultas sobre la base de datos:
1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
*/
Select * from jugadores order by Nombre;
/*
2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
ordenados por nombre alfabéticamente.
*/
select * from jugadores Where Posicion = 'C' order by Nombre;
/*
3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
*/
select * from equipos order by Nombre;
/*
4. Mostrar el nombre de los equipos del este (East).
*/
select * from equipos where Conferencia = 'East' order by Nombre;
/*
5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
*/
select * from equipos where Ciudad like 'c%' order by Nombre;
/*
6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
*/
select j.Nombre, e.Nombre from jugadores j inner join equipos e on j.Nombre_equipo = e.Nombre order by e.Nombre;
/*
7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
*/
select j.Nombre, e.Nombre from jugadores j inner join equipos e on j.Nombre_equipo = e.Nombre where e.Nombre = 'Raptors' order by j.Nombre;
/*
8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
*/
select j.Nombre, e.Puntos_por_partido, e.temporada from jugadores j inner join estadisticas e on j.codigo = e.jugador where j.Nombre = 'Pau Gasol';
/*
9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
*/
select j.Nombre, e.Puntos_por_partido, e.temporada from jugadores j inner join estadisticas e on j.codigo = e.jugador where j.Nombre = 'Pau Gasol' and e.temporada = '04/05';
/*
10. Mostrar el número de puntos de cada jugador en toda su carrera.
*/
select j.Nombre, sum(e.Puntos_por_partido) as PuntosCarrera from jugadores j inner join estadisticas e on j.codigo = e.jugador group by j.Nombre order by j.Nombre;
/*
11. Mostrar el número de jugadores de cada equipo.
*/
select count(j.Nombre), e.Nombre from jugadores j inner join equipos e on j.Nombre_equipo = e.Nombre group by e.Nombre;
/*
12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
*/
select j.Nombre, sum(e.Puntos_por_partido) as PuntosCarrera from jugadores j inner join estadisticas e on j.codigo = e.jugador group by j.Nombre order by PuntosCarrera desc limit 1;

select j.Nombre, sum(e.Puntos_por_partido) as PuntosCarrera from jugadores j inner join estadisticas e on j.codigo = e.jugador group by j.Nombre having sum(e.Puntos_por_partido) = (select max(p1.puntos) from (select sum(e.Puntos_por_partido) puntos from estadisticas e group by e.jugador) p1);

select max(p1.puntos) from (select sum(e.Puntos_por_partido) puntos from estadisticas e group by e.jugador) p1;

/*
13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
*/
select j.Nombre, j.Altura, e.Nombre, e.Conferencia, e.Division from jugadores j inner join equipos e on j.Nombre_equipo = e.Nombre where j.Altura = (select max(Altura) from jugadores);
/*
14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor
diferencia de puntos.
*/
select equipo_local, puntos_local, equipo_visitante, puntos_visitante, abs(puntos_local - puntos_visitante) Diferencia from partidos order by Diferencia desc limit 1;

select equipo_local, puntos_local, equipo_visitante, puntos_visitante, abs(puntos_local - puntos_visitante) as Diferencia from partidos where abs(puntos_local - puntos_visitante) = (select max(abs(puntos_local - puntos_visitante)) from partidos);
select max(p1.diferencia) from (select abs(puntos_local - puntos_visitante) diferencia from partidos) p1;
/*
15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,
equipo_ganador), en caso de empate sera null.
*/
select equipo_local, puntos_local, equipo_visitante, puntos_visitante, case when (puntos_local - puntos_visitante) > 0 then equipo_local  when (puntos_local - puntos_visitante) < 0 then equipo_visitante else  null end as Ganador from partidos;



/*
Integrador 

CANDADO A
Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/ siguiente/s consulta/s:
Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
*/

SELECT COUNT(*) FROM estadisticas e GROUP BY e.Asistencias_por_partido ORDER BY e.Asistencias_por_partido DESC LIMIT 1;
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4) "2"

select count(Asistencias_por_partido) from estadisticas e where e.Asistencias_por_partido = (select max(Asistencias_por_partido) from estadisticas);

/*
Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de datos:
Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea centro
 o esté comprendida en otras posiciones. "!14043"
*/
SELECT SUM(j.peso) FROM jugadores j JOIN equipos e on e.Nombre = j.nombre_equipo where e.Conferencia like 'east' and j.Posicion LIKE '%c%';


/*
CANDADO B
Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de jugadores que tiene el equipo Heat.
*/

SELECT COUNT(Nombre) FROM jugadores j JOIN estadisticas e on e.jugador = j.codigo WHERE e.Asistencias_por_partido >= all (SELECT COUNT(*) FROM jugadores j WHERE j.Nombre_equipo = 'Heat' group by j.Nombre_equipo);

-- Este resultado nos dará la posición del candado (1, 2, 3 o 4) "3"

/*Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de datos:
La clave será igual al conteo de partidos jugados durante las temporadas del año 1999. "3480"
*/

SELECT COUNT(temporada) FROM partidos WHERE temporada like '%99%';

/*
CANDADO C
El candado C está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman parte de equipos de la conferencia oeste.
Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a 195, y a eso le vamos a sumar 0.9945.
Este resultado nos dará la posición del candado (1, 2, 3 o 4) "1"*/

SELECT COUNT(*)/(SELECT COUNT(*) FROM jugadores ju WHERE ju.Peso >= 195 ) + 0.9945 FROM jugadores j JOIN equipos e on e.Nombre = j.Nombre_equipo WHERE j.Procedencia = 'Michigan' and e.Conferencia = 'west';

/*
Clave: La clave del candado C estará con formada por la/s siguientes consulta/s a la base de datos: "631"
Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de sumar:
el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
tapones por partido. Además, este resultado debe ser, donde la división sea central.
*/
SELECT floor(avg(est.Puntos_por_partido)+count(est.asistencias_por_partido)+sum(est.tapones_por_partido)) FROM estadisticas est JOIN jugadores j on est.jugador=j.codigo JOIN equipos eq on j.Nombre_equipo=eq.Nombre WHERE eq.Division='Central';

/*
CANDADO D
Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01.
Este resultado debe ser redondeado. Nota: el resultado debe estar redondeado.
*/

SELECT ROUND(e.tapones_por_partido) FROM estadisticas e JOIN jugadores j on j.codigo = e.jugador WHERE e.temporada = '00/01' and j.Nombre = 'Corey Maggette';

-- Este resultado nos dará la posición del candado (1, 2, 3 o 4) "4"

/*
Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de datos: "191"
Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
de todos los jugadores de procedencia argentina.*/

SELECT floor(sum(Puntos_por_partido)) FROM estadisticas e JOIN jugadores j on e.jugador=j.codigo WHERE Procedencia='Argentina';
