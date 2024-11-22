@Navigation
Feature: Cuando la barra de navegacion me permite navegar
    Para ver las paginas de FRT

    Background: Estoy en la pagina de FRT sin loguearme
        Given abro www.freerangetesters.com

    @Courses
    Scenario Outline: Puedo acceder a las secciones
        When voy a <section> usando la barra de navegacion
        Examples:
            | section    |
            | Cursos     |
            | Recursos   |
            | Blog       |
            | Mentorías  |
            | Udemy      |

    Scenario: cursos son presentados a potenciales clientes
        Given navego a www.freerangetesters.com
        When voy a Cursos usando la barra de navegacion
        And selecciono introduccion al testing

#       para ejecutar sólo este tag hay que poner en la terminal
#       gradle test -D cucumber.filter.tags="@Plans"

#       para NO ejecutar este tag hay que poner
#        gradle test -D cucumber.filter.tags="not@Plans"

#       para ejecutar dos escenarios hay que poner
#       gradle test -D cucumber.filter.tags="@Plans or @Courses"

    @Plans
    Scenario: usuario puede seleccionar un plan
        Given navego a www.freerangetesters.com
        When The user selecciono Elegir Plan
        Then The user puede validar opciones en la pagina