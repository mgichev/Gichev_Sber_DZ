Консольный вывод:  
DZ1.Parent:static 1  
DZ1.Parent:static 2  
DZ1.Child:static 1  
DZ1.Child:static 2  
DZ1.Parent:instance 1  
DZ1.Parent:instance 2  
DZ1.Parent:constructor  
DZ1.Child:instance 1  
DZ1.Child:instance 2  
DZ1.Child:constructor  
DZ1.Parent:instance 1  
DZ1.Parent:instance 2  
DZ1.Parent:name-constructor  
DZ1.Child:instance 1  
DZ1.Child:instance 2  
DZ1.Child:name-constructor  

Таким образом, сначала были выполнены статические блоки кода у родительского класса, затем у дочернего.
Затем были выполнены нестатические блоки кода, вызван родительский конструктор, дочерние нестатические блоки кода и дочерний конструктор.
Для второго объекта аналогично.
