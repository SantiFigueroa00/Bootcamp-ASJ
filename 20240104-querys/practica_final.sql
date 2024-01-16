--1 Listar todos los artitas por Discografica, ordenados por el nombre del artista
SELECT a.nombre as Nombre, d.nombre as Discografica
FROM artista a
INNER JOIN discografica d on d.id = a.discografica_id
ORDER BY d.nombre ASC, a.nombre ASC;

--2 Que Discográfica NO tiene artistas?
SELECT d.nombre FROM discografica d
WHERE d.id NOT IN(SELECT a.discografica_id FROM artista a)

--3  Listar el numero de canciones por artista en orden descendiente
SELECT a.nombre as 'Nombre Artista', COUNT(c.id) as 'Numero de canciones'
FROM artista a
INNER JOIN album alb ON a.id=alb.artista_id
INNER JOIN canciones c ON alb.id=c.album_id
GROUP BY a.nombre
ORDER BY COUNT(c.id) DESC;

--4 Que artista grabó el mayor numero de canciones?
SELECT a.nombre as 'Nombre Artista', COUNT(c.id) as 'Numero de canciones'
FROM artista a
INNER JOIN album alb ON a.id=alb.artista_id
INNER JOIN canciones c ON alb.id=c.album_id
GROUP BY a.nombre
HAVING COUNT(c.id) = (SELECT MAX(cuenta_canciones) FROM (SELECT COUNT(id) as cuenta_canciones FROM canciones GROUP BY album_id) as subquery);

--5 Por cada artista y cada album, cuantas canciones tienen menos de 5 minutos de duracion?
SELECT a.nombre as 'Nombre Artista', alb.nombre as 'Nombre de Album' , COUNT(c.id) as 'Numero de canciones'
FROM artista a
INNER JOIN album alb ON a.id=alb.artista_id
INNER JOIN canciones c ON alb.id=c.album_id
WHERE c.duracion<5
GROUP BY a.nombre, alb.nombre

--6 En relación con la consulta anterior, muestra también las canciones y su duración
SELECT a.nombre as 'Nombre Artista', alb.nombre as 'Nombre de Album', c.nombre as 'Nombre de Cancion', c.duracion as 'Duracion'
FROM artista a
INNER JOIN album alb ON a.id=alb.artista_id
INNER JOIN canciones c ON alb.id=c.album_id
WHERE c.duracion<5
ORDER BY a.nombre, alb.nombre;

--7 Qué artistas grabaron canciones mas largas que 5 minutos, y cuántas canciones fueron?
SELECT a.nombre as 'Nombre Artista' , COUNT(c.id) as 'Numero de canciones'
FROM artista a
INNER JOIN album alb ON a.id=alb.artista_id
INNER JOIN canciones c ON alb.id=c.album_id
WHERE c.duracion>5
GROUP BY a.nombre

--8 En que año se grabaron la mayoría de las canciones?
SELECT TOP 1 COUNT(c.id) as 'Numero de canciones', alb.anio as 'Añio'
FROM album alb
INNER JOIN canciones c ON alb.id=c.album_id
GROUP BY alb.anio
ORDER BY COUNT(c.id) DESC;

--9 Mostrar el ranking de los 5 artistas, album, canción y año con las canciones más largas
SELECT TOP 5 a.nombre as 'Nombre Artista', alb.nombre as 'Nombre de Album' , c.nombre as 'Nombre de cancion', alb.anio as 'Año', c.duracion as 'Duracion'
FROM artista a
INNER JOIN album alb ON a.id=alb.artista_id
INNER JOIN canciones c ON alb.id=c.album_id
ORDER BY c.duracion DESC;


--10 Duración total de todas las canciones grabadas por cada artista en orden descendente
SELECT a.nombre as 'Nombre Artista',  ROUND(SUM(c.duracion), 2) as 'Suma Duracion'
FROM artista a
INNER JOIN album alb ON a.id=alb.artista_id
INNER JOIN canciones c ON alb.id=c.album_id
GROUP BY a.nombre
ORDER BY SUM(c.duracion) DESC;


--11 Que artistas y album no tienen canciones de menos de 5 minutos?
SELECT a.nombre as 'Artista', alb.nombre as 'Album' FROM artista a
INNER JOIN album alb ON a.id=alb.artista_id
WHERE alb.id NOT IN (SELECT alb.id FROM album alb 
                        INNER JOIN canciones c ON c.album_id = alb.id
                        WHERE c.duracion < 5)


--12  Mostrar el top 3 de artistas con el promedio de duración de las canciones, en orden descendente con la canción mas larga primero 
SELECT TOP 3 a.nombre 'Nombre Artista', ROUND(AVG(c.duracion),2) as 'Promedio de duracion'
FROM artista a
JOIN album al ON al.artista_id = a.id
JOIN canciones c ON c.album_id = al.id
GROUP BY a.nombre
ORDER BY AVG(c.duracion) DESC

SELECT  a.nombre as 'Nombre Artista',c.nombre as 'Nombre Cancion', c.duracion as Duracion
FROM (
    SELECT TOP 3 a.id as id_Artista, AVG(c.duracion) as DuracionPromedio
    FROM artista a
    INNER JOIN album alb ON a.id = alb.artista_id
    INNER JOIN canciones c ON alb.id = c.album_id
    GROUP BY a.id
	ORDER BY AVG(c.duracion) DESC
) AS Subquery
INNER JOIN artista a ON a.id=Subquery.id_Artista
INNER JOIN album alb ON a.id = alb.artista_id
INNER JOIN canciones c ON alb.id = c.album_id
ORDER BY DuracionPromedio Desc, duracion DEsc;

--13 Qué artistas no lanzaron un album durante la decada de 1980 y 1990?
SELECT DISTINCT a.nombre as 'Artista'
FROM artista a
WHERE a.id NOT IN (SELECT a.id FROM album alb 
						INNER JOIN artista a ON a.id=alb.artista_id
                        WHERE alb.anio BETWEEN '1980' AND '1990');



--14 Duración total del album Sgt. Pepper's de los Beatles (mostrar en minutos y segundos)
SELECT alb.nombre as 'ALBUM', FLOOR(SUM(c.duracion)) as 'Minutos', FLOOR((SUM(c.duracion)-FLOOR(SUM(c.duracion)))*60) as 'Segundos'
FROM album alb 
INNER JOIN canciones c ON c.album_id=alb.id
WHERE alb.nombre LIKE 'Sgt. Pepper%'
GROUP BY alb.nombre

