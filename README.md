# taller03_fernandez_tapia_villarroel
## Integrantes: Jesús Tapia, Benjamín Fernandez, Yoandri Villarroel.

## Primer Commit: 
### Clases identificadas: 
* EmpresaTransportista, Sucursal, Camion, Flete, Pack y Producto
### Relaciones identificadas: 
* Composicion entre EmpresaTransportista y Sucursal ya que las Sucursales es PARTE de la empresa.
* Asociacion Bidireccional entre Sucursal y Camion ya que cada Sucursal cuenta con un camion y un camion pertenece a solo una sucursal
* Asociacion Unidireccional entre Camion y Flete ya que el camion es capaz de realizar muchos fletes pero los fletes no sabe que existe la clase camion.
* Asociacion Unidireccional entre Flete y Pack ya que los fletes tiene entre 1 y 5 packs, pero packs no sabe de la existencia de la clase flete.
* Asociacion Unidireccional entre Pack y Producto ya que los packs pueden tener entre 1 a 20 productos pero los productos no saben de la existencia de la clase Pack.

## Segundo commit:

![image](https://github.com/JesusTapiaMartin/taller03_fernandez_tapia_villarroel/assets/142508978/7c613c9c-300d-4f86-9dba-a6684dc5b287)
