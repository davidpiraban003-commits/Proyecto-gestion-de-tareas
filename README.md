 Preguntas proyecto Springboot
 En el día a día, las personas y los equipos de trabajo pierden una enorme cantidad de tiempo y productividad por la falta de claridad en sus prioridades o por no saber en qué estado real se encuentran sus pendientes.
 Este sistema no es una simple lista de tareas, es una plataforma diseñada para centralizar el control. Al vincular de forma inteligente a cada Usuario con sus Tareas y sus respectivos Estados (como 'Pendiente' o 'Completada'), resolvemos el caos operativo.
 Permitimos que el flujo de trabajo sea transparente, organizado y que cada quien sepa exactamente qué hacer y cuándo


 El proyecto está construido bajo una arquitectura limpia separada en capas: Entidades, Repositorios, Servicios y Controladores. 
 El Controlador solo atiende las peticiones web, el Servicio procesa la lógica de negocio, y el Repositorio maneja los datos 
 Si el día de mañana decidimos cambiar la base de datos o modificar una regla de negocio, el resto de la aplicación seguirá intacta. 
 Esto garantiza un software escalable, ordenado y fácil de mantener a largo plazo


 Implemente DTOs (Data Transfer Objects) por dos razones críticas: seguridad de la información y eficiencia en la red. Por seguridad, nunca debemos exponer datos sensibles, por ejemplo, al consultar un Usuario,  
 Por eficiencia, al crear una Tarea, el cliente no necesita enviar objetos pesados y complejos; gracias al TareaRequestDTO, basta con enviar datos planos y los identificadores numéricos. 
 Esto optimiza el rendimiento de la API y protege la integridad de la base de datos

Para evitar que la aplicación colapse o muestre pantallas de error técnicas e intimidantes, implemente un Manejador Global de Excepciones GlobalExceptionHandler. 
Si un usuario busca una tarea con un ID que no existe, el sistema intercepta el error antes de que cause un fallo mayor y le devuelve una respuesta clara, amable y estructurada en formato JSON (como un 404 Not Found). 
Esto no solo mejora radicalmente la experiencia del usuario, sino que facilita las tareas de soporte técnico y mantenimiento del sistema.

 
