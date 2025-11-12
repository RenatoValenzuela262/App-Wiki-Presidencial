package com.grupoMMR.wikipresidencial.view.home.objeto

import com.grupoMMR.wikipresidencial.R

data class Candidato(
    val nombre: String,
    val edad: Int,
    val lugarNacimiento: String,
    val nacionalidad: String,
    val historialPolitico: String,
    val estudios: String,
    val propuestas: String,
    val partidoPolitico: String,
    val foto: Int
)

object CandidatosRepository {
    val listaCandidatos = listOf(
        Candidato(
            nombre = "Franco Parisi",
            edad = 58,
            lugarNacimiento = "Santiago",
            nacionalidad = "Chilena",
            historialPolitico =
                    "Candidaturas presidenciales previas:" +
                    "\n - 2013 (4to lugar)" +
                    "\n - 2021 (3er lugar)",
            estudios =
                "- Instituto Nacional General José Miguel Carrera" +
                "\n- Posgrado de Administración - Universidad de Georgia" +
                "\n- Ingeniería Comercial - Universidad de Chile",
            propuestas = "...",
            partidoPolitico = "Partido de la Gente",
            foto = R.drawable.PARISI
        ),
        Candidato(
            nombre = "José Antonio Kast",
            edad = 59,
            lugarNacimiento = "Santiago",
            nacionalidad = "Chilena",
            historialPolitico = "Candidaturas Presidenciales previas:" +
                                "\n- 2017 (4to Lugar)" +
                                "\n- 2021 (2do Lugar)",
            estudios = "Derecho",
            propuestas = "...",
            partidoPolitico = "Partido Republicano de Chile",
            foto = R.drawable.KAST
        ),
        Candidato(
            nombre = "Jeannette Jara Román",
            edad = 51,
            lugarNacimiento = "Santiago",
            nacionalidad = "Chilena",
            historialPolitico =
                "- Subsecretaría de Previsión Social en el segundo gobierno de la presidenta Michelle Bachelet (2016-2018)" +
                        "\n- Ministro del Trabajo y Previsión Social de Chile (2022-2025)",
            estudios =
                "- Licenciatura en Administración Pública" +
                "\n- Universidad de Santiago de Chile" +
                "\n- Universidad Central de Chile",
            propuestas = "...",
            partidoPolitico = "Partido Comunista de Chile",
            foto = R.drawable.JARA
        ),
        Candidato(
            nombre = "Marco Antonio Enríquez-Ominami",
            edad = 52,
            lugarNacimiento = "Santiago de Chile",
            nacionalidad = "Chilena y Francesa",
            historialPolitico =
                "Candidaturas Presidenciales previas: \n" +
                        "- 2009 (3er Lugar)\n" +
                        "- 2013 (3er Lugar)\n" +
                        "- 2017 (6to Lugar)\n" +
                        "- 2021 (6to Lugar)",
            estudios = "- Universidad de Chile",
            propuestas = "",
            partidoPolitico = "Independiente",
            foto = R.drawable.MEO
        ),
        Candidato(
            nombre = "Johannes Kaiser Barents von Hohenhagen",
            edad = 49,
            lugarNacimiento = "Santiago de Chile",
            nacionalidad = "Chilena",
            historialPolitico = "",
            estudios = "",
            propuestas = "",
            partidoPolitico = "Partido Nacional Libertario",
            foto = R.drawable.KAISER
        ),
        Candidato(
            nombre = "Eduardo Antonio Artés Brichetti",
            edad = 73,
            lugarNacimiento = "Santiago de Chile",
            nacionalidad = "Chilena",
            historialPolitico =
                    "Candidaturas Presidenciales previas: \n" +
                    "- 2017 (7mo Lugar)\n" +
                    "- 2021 (7mo Lugar)",
            estudios = "",
            propuestas = "",
            partidoPolitico = "Partido Comunista Chileno (Acción Proletaria)",
            foto = R.drawable.ARTES
        ),
        Candidato(
            nombre = "Evelyn Matthei Fornet",
            edad = 71,
            lugarNacimiento = "Santiago de Chile",
            nacionalidad = "Chilena",
            historialPolitico = "Candidaturas Presidenciales previas: " +
                    "\n- 2013 (2do Lugar)",
            estudios = "",
            propuestas = "",
            partidoPolitico = "Unión Demócrata Independiente",
            foto = R.drawable.MATTHEI
        ),
        Candidato(
            nombre = "Harold Mayne-Nicholls Sécul",
            edad = 64,
            lugarNacimiento = "Antofagasta, Chile",
            nacionalidad = "Chilena",
            historialPolitico = "No tiene",
            estudios = "- Periodismo - Pontificia Universidad Católica de Chile" +
                    "\n- Administración de Empresas - Universidad Adolfo Ibáñez",
            propuestas =
                "Seguridad\n" +
                        "Creará un Comité Nacional de Seguridad para coordinar fuerzas policiales e inteligencia.\n" +
                        "\n" +
                        "\n" +
                        "Refuerzo de fronteras y combate directo al crimen organizado y narcotráfico.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        " Economía y empleo\n" +
                        "Apoyo a las pymes y reactivación del crecimiento con inversión responsable.\n" +
                        "\n" +
                        "\n" +
                        "Reglas fiscales claras y reforma del Estado para hacerlo más eficiente y menos político.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        " Salud\n" +
                        "Reducir listas de espera y mejorar la atención primaria.\n" +
                        "\n" +
                        "\n" +
                        "Enfocar políticas en salud mental y vida saludable para prevenir enfermedades.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        " Vivienda\n" +
                        "Vivienda digna y fin de campamentos mediante alianzas público-privadas.\n" +
                        "\n" +
                        "\n" +
                        "Uso de terrenos fiscales y subsidios de arriendo para ampliar el acceso habitacional.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        " Educación\n" +
                        "Crear un Instituto Autónomo de Educación libre de influencias políticas.\n" +
                        "\n" +
                        "\n" +
                        "Fortalecer la educación técnica y aumentar horas de educación física.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        " Innovación y tecnología\n" +
                        "Impulsar un Estado digital y transparente con trámites 100 % en línea.\n" +
                        "\n" +
                        "\n" +
                        "Crear un Fondo Nacional de Ciencia e Innovación y promover la inteligencia artificial ética.\n" +
                        " Democracia y transparencia\n" +
                        "Tolerancia cero a la corrupción, con penas de cárcel para corruptores.\n" +
                        "\n" +
                        "\n" +
                        "Fomentar la participación ciudadana digital y rendición pública de cuentas.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        " Deporte\n" +
                        "Aumentar las horas de actividad física escolar y el deporte comunitario.\n" +
                        "\n" +
                        "\n" +
                        "Promover la igualdad de género y postular a Chile a eventos deportivos internacionales.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        " Medio ambiente\n" +
                        "Impulsar energías limpias y economía verde.\n" +
                        "\n" +
                        "\n" +
                        "Proteger ecosistemas y promover un desarrollo sustentable.",
            partidoPolitico = "Independiente",
            foto = R.drawable.MAYNENICHOLLS
        )
    )
}