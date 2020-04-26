### LENGUAJE DE PROGRAMACIÓN

Mi nombre es Sebastian Rodriguez actualmente estudiante de la Universidad de San Buenaventura en la tecnología de desarrollo de software.
Este espacio será utilizado para la clase de lenguaje de programación dirigida por el ing. Luis Eduardo Barreto para compartir nuestros trabajos y archivos vistos en la clase y en es especial nuestro proyecto del semestre el cual es el siguiente.



**Tabla de contenidos**

[TOC]

# StartM

![](https://github.com/Kanaitt/Lenguajes-de-Programacion/blob/master/Proyecto/src/recursos/Iconos/Logopeque%C3%B1o.png?raw=true)


## Planteamiento del problema.

### Problema.
El principal problema es la falta de organización de los procesos que tiene una empresa de ejecución de eventos audiovisuales, comenzando el conflicto en las instalaciones principales donde el problema recurrente empieza desde que se recibe una solicitud de cotización hasta la salida del equipo adecuado para el evento asignado. La responsabilidad recae en todos los integrantes por la poca comunicación de salidas y entradas de los diferentes equipos que tienen la empresa aquí algunos ejemplos que se dan actualmente: El personal comercial no lleva un control de que equipos que están en el inventario, la encargada de la contabilidad no sabe cuántas cotizaciones han sido aprobadas y para eso tiene que consultar con la persona del área comercial, el jefe a cargo no posee información de que producto a salido de inventario y que ganancia en especial tiene ese producto.
La falta de comunicación o la información errónea entre los empleados hace que todos estos problemas sean muy frecuentes y dependan mucho de un tercero para darle una solución rápida a un cliente como también ocasiona demoras en la selección y separación de los artículos para días específicos.

### Solución.

Es necesario un programa para dar solución a la falta de comunicación que se tienen entre las áreas y los diferentes cargos de la empresa donde todos los participantes tengan conocimiento oportuno y un control exacto de las ordenes creadas, así como de la logística necesarias para llevar a cabo su realización en los tiempos establecidos.
Esta solución propuesta podría tener un gran impacto en la organización empresarial del sector audiovisual teniendo en cuenta que se les proporcionaría a los empleados una plataforma donde desempeñar sus funciones más organizadamente dándoles la oportunidad de minimizar errores, pero también ser más eficientes con los tiempos propuestos.

## Stakeholders.

### Stakeholders primarios.

- Usuario admin: tendrá el acceso total a todas las pestañas del programa, podrá crear, modificar y borrar los usuarios, agregar, modificar y borrar los productos del inventario, agregar y modificar los proveedores y clientes, monitorear, modificar y sacar un informe de los productos que saldrán a un evento, realizar las cotizaciones, revisar y sacar informes de inventario, cotizaciones y ganancias.
- Usuario super usuario: vendrá establecido por el sistema tendrá todos los accesos y no puede ser borrado por ningún usuario, solo puede haber uno en el sistema.
- Usuario con roles, se encargarán de diferentes secciones en el funcionamiento del programa siendo los roles los siguientes:
  - Rol comercial: podrá agregar y modificar los proveedores y clientes, realizar cotizaciones y sacar su respectivo informe.
  - Rol bodeguero: podrá agregar, modificar y borrar productos del inventario.
  - Rol técnico: podrá monitorear y modificar los productos que saldrán a un evento.
  - Rol contable: podrá sacar informes de las cotizaciones y ganancias.

### Stakeholders secundarios.

- Proveedores.
- Clientes.
- Seguridad en eventos.
- Aseguradoras.

## Requerimientos.

A continuación, se presentará el listado de los requerimientos funcionales y los requerimientos no funcionales de la aplicación. Siendo RF_x como requerimiento funcional_ número del requerimiento y RNF_x como requerimiento no funcional_ número del requerimiento.

| ID Requerimiento | Descripción  | Prioridad |
| :------------ |:---------------:| -----:|
| `RF_1` | El sistema debe permitir un inicio de sesión con un usuario y contraseña ya establecido en el programa. Será conocido como super usuario.| Alta |
| `RF_2` |El sistema debe permitir al super usuario crear otro usuario.|Alta|
|`RF_3`|El sistema debe permitir al super usuario modificar otro usuario.|Alta|
|`RF_4`|El sistema debe permitir al super usuario borrar otro usuario.|Alta|
|`RF_5`|El sistema debe permitir que el super usuario otorgue o modifique los permisos a los otros usuarios.| Alta|
|`RF_6`|El sistema debe permitir a cualquier usuario incluyendo el super usuario cerrar la sesión.|Alta|
|`RF_7`|El sistema deberá permitir que un usuario anteriormente creado inicie sección.|Alta|
|`RF_8`|El sistema deberá generar un cambio de contraseña cuando sea la primera vez que inicie sección.|Alta|
|`RNF_1`|El sistema tendrá una interfaz gráfica desarrollada en JAVA|Alta|
|`RNF_2`|El sistema tendrá portabilidad para diferentes computadores.|Alta|
|`RNF_4`|El sistema almacenara los datos en la nube para su funcionamiento en los computadores que están instalados.|Alta|
|`RNF_6`|El sistema tendrá concurrencia entre los usuarios.|Alta|
