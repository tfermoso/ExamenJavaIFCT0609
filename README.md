# ExamenJavaIFCT0609
Examen Java IFCT0609
Vamos a crear una aplicación de consola para la gestión del inventario de productos de un almacén.
Los productos que puede haber en el almacén tienen una referencia (String), un precio (double) y un stock (int). 
La aplicación debe permitir:
añadir productos nuevos al almacén (indicando referencia, precio y stock).
incrementar el stock de un producto que está en el almacén
retirar una o más unidades de un producto
consultar stock de un producto
consultar precio de un producto
modificar el precio de un producto

Para realizar el proyecto tenéis que clonar el siguiente repositorio, crear una rama con vuestro nombre, commitear cada avance que realices en la aplicación y subir todo al repositorio cuando finalices.

Requisitos de diseño:
Crear Clase Producto
Crear Interface IAlmacen
   void nuevoProducto(referencia,precio,stock)
   void seleccionarProducto(referencia)
   void incrementarStock(unidades)
   void retirarProducto(unidades)
   int consultarStock()
   double consultarPrecio()
   void modificarPrecio(nuevoPrecio)
Crear Clase Almacen que implemente la interfaz IAlmacen
La clase Almacén tendrá una propiedad que será una lista de productos y otra propiedad que será el producto seleccionado.
