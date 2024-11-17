Консольный вывод:
Parent:static 1
Parent:static 2
Child:static 1
Child:static 2
Parent:instance 1
Parent:instance 2
Parent:constructor
Child:instance 1
Child:instance 2
Child:constructor
Parent:instance 1
Parent:instance 2
Parent:name-constructor
Child:instance 1
Child:instance 2
Child:name-constructor

Таким образом, сначала были выполнены статические блоки кода у родительского класса, затем у дочернего.
Затем были выполнены нестатические блоки кода, вызван родительский конструктор, дочерние нестатические блоки кода и дочерний конструктор.
Для втого объекта аналогично.
