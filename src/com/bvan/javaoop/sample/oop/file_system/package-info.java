/**
 * Создать классы Directory, File, которые имеют метод getSize().
 * Файл имеет фиксированный размер, размер директории считается по содержимому.
 * В директорию можно вкладывать как файл, так и другую директорию. Зацикливания недопустимы.
 * <p>
 * Создать иерархию директорий (клиентский код):
 * root
 * |--- dir1
 * |     |--- f1 (10 B)
 * |     |--- f2 (20 B)
 * |
 * |--- dir2
 * |     |--- dir3
 * |     |     |--- f3 (30 B)
 * |     |
 * |     |--- f4 (40 B)
 * |
 * |--- f5 (50 B)
 * <p>
 * Посчитать размер директории root.
 * <p>
 * Иерархия директорий - это ИЕРАРХИЯ ОБЪЕКТОВ, а НЕ классов.
 * Реально создавать файлы и директории НЕ НУЖНО.
 *
 * @author bvanchuhov
 */
package com.bvan.javaoop.sample.oop.file_system;