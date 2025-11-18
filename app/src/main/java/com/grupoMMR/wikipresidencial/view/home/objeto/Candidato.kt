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
            propuestas = "Modificar el sistema de evaluación de programas estatales de DIPRES, aumentando el peso de los indicadores de eficiencia (30%)," +
                    " economía (30%) y calidad (25%), y disminuyendo la eficacia (15%)\n" +
                    "Impulsar Proyecto de Ley de Delación Compensada ('Ley Topo') como mecanismo de incentivo para prevenir y erradicar la corrupción en el aparato público\n\n"+
                    "Salud\n"+
                    "Diseño e implementación de una Ficha Clínica Electrónica Única y Universal, bajo los principios de centralización e interoperabilidad" +
                    " con todos los niveles del sistema (APS, hospital, SAMU, urgencias).\n" +
                    "Estrategia Nacional para disminuir listas de espera GES basado en seis ejes, incluyendo el uso de datos para priorización, la ampliación de " +
                    "cobertura con compras privadas cuando sea más rápido, y turnos extendidos e incentivos internos.\n\n" +
                    "Educación\n" +
                    "Promover el desarrollo del espíritu emprendedor en la Educación Media Técnico Profesional (EMTP) y apoderados, incluyendo un cambio curricular con" +
                    " enfoque en creatividad, autonomía, y modelos de negocio con IA.\n" +
                    "Profundizar un circuito de valor en las trayectorias formativas desde la educación media TP hacia el mercado laboral minero y escalar este modelo a " +
                    "rubros estratégicos (energía, salud, agro, tecnología).\n\n" +
                    "Seguridad\n" +
                    "Impulsar reforma del marco normativo para establecer la separación estricta de funciones entre Carabineros (rol preventivo y orden público) y PDI" +
                    " (exclusiva responsabilidad investigativa y policía judicial).\n" +
                    "Evaluación de la creación de la Policía Municipal Armada en Chile, dotando a los municipios de cuerpos policiales profesionales, armados y coordinados.\n\n" +
                    "Es Terrorismo: No tiene otro nombre\n" +
                    "Pérdida total de beneficios estatales otorgados a individuos que se vean involucrados en actos de violencia terrorista, incluyendo a su familia.\n" +
                    "Implementación del Plan piloto ZAGLO (Zonas de Apoyo Geoestratégico Logístico Operativo) para atacar y controlar el terrorismo en las regiones afectadas" +
                    " (Macro Zona Sur), mediante la creación de una Unidad Táctica Especial \"Victoria\" (UTE-V)\n\n"+
                    "Sistema Penitenciario y Gendarmería\n" +
                    "Arrendamiento de Unidades Penitenciarias Flotantes (Barcos Cárceles) con foco en reos de alta peligrosidad (terroristas y crimen organizado), ubicados a 80 millas de tierra firme.\n" +
                    "Trabajo penitenciario obligatorio para que las personas privadas de libertad retribuyan el daño social y económico, prestando servicios tanto a privados como a organismos del Estado.\n\n" +
                    "Defensa Fronteriza y Fronteras Inteligentes\n" +
                    "Implementación del Plan GOFRA (Gestión Operacional Fronteriza de Reacción Avanzada), una valla tecnológica con enjambre de drones y sistemas informáticos integrados.\n" +
                    "Modificar la Ley de Migración y Extranjería para limitar a los extranjeros con certificado de residencia temporal en trámite para solicitar una patente comercial en Chile.\n\n"+
                    "Familias, Infancias y Mujeres\n"+
                    "Castración química obligatoria, bajo estricta supervisión médica, a violadores de mujeres, infantes y adolescentes, desde el primer delito, como pena accesoria.\n" +
                    "Fusión del Ministerio de Desarrollo Social y Familia con el Ministerio de la Mujer con el fin de articular y coordinar de forma más eficiente los programas y políticas sociales.\n\n" +
                    "Economía y MiPymes\n"+
                    "Modificar el Decreto Ley N.º 825 para la implementación de la devolución del IVA a medicamentos y eliminación definitiva del impuesto.\n"+
                    "Modificar el Decreto Ley N.°825 para la implementación de la devolución universal del IVA sobre la canasta básica como política pública de alivio al costo de vida.\n\n"+
                    " Minería para hoy, minería para Chile\n"+
                    "Concesionar la explotación del litio bajo licitación pública de portafolio de empresas privadas aplicando un porcentaje de dominio accionista por parte del Estado chileno.\n" +
                    "\nAmpliar el Consejo Nacional de Competencias Sectoriales para transversalizar la cadena de valor, incluyendo otras industrias (agricultura, tecnología, etc.), para que la minería" +
                    " necesita de ellas para su crecimiento estratégico.\n\n" +
                    "Energía y Medio Ambiente" +
                    "Implementación obligatoria de sistemas de reúso de aguas grises en edificios públicos.\n" +
                    "Revolución Hídrica y Restauración Ecosistémica con el objetivo de restaurar 2 millones de hectáreas con especies nativas y crear 20.000 empleos verdes.\n\n" +
                    " Agricultura: Protegiendo e impulsando nuestro granero nacional\n" +
                    "Red Nacional de Carreteras Hídricas Intercuencas para Seguridad Hídrica y Productiva mediante implementación de infraestructura estratégica bajo concesiones privadas sin subsidio fiscal\n" +
                    "Plan San Isidro de créditos con aval del Estado a pequeños y medianos agricultores para aumentar productividad y ventas (financiamiento dirigido a riego tecnificado, manejo de suelos, tecnología y semillas).\n\n"+
                    "Deporte del hoy, deporte del mañana\n"+
                    "Reforma normativa para la equidad territorial en el financiamiento del deporte, incluyendo criterios de redistribución automática de fondos no adjudicados y simplificación para organizaciones comunitarias.\n" +
                    "Reconocer los e-sports como disciplina deportiva digital en el marco del Instituto Nacional del Deporte (IND), incorporándolos al Sistema Nacional del Deporte, y establecer medidas de facilitación tributaria para eventos.\n\n"+
                    "Nos interesan tus neuronas: Ciencia, Tecnología e Innovación\n"+
                    "Ampliar las modalidades de retribución para becarios ANID en el extranjero, permitiendo una retribución académica remota e internacionalmente activa (ej. mediante publicaciones o co-supervisión en universidades chilenas).\n" +
                    "Fortalecimiento del Ecosistema de Innovación Aplicada FONDEF en Chile, creando una línea de continuidad con CORFO para el escalamiento de prototipos validados y exigiendo una estrategia de propiedad intelectual desde la postulación.\n\n"+
                    "Vivienda y Bienes de Chile\n"+
                    "Proponer Nuevos Diseños de Vivienda Social, como casas modulares prefabricadas de madera tratada, de alta tecnología, con buen diseño y cuyo valor sea de \$40.000.000 (urbanización incluida)\n" +
                    "-Eliminar la obligación de habitar la vivienda adquirida por beneficio estatal, permitiendo el arriendo de la vivienda obtenida con subsidio, siendo ese ingreso un monto afecto al pago de impuesto a la renta.\n\n"+
                    "Hacia adelante, Pueblos Originarios\n"+
                    "Promover la modificación del artículo 13 de la Ley Indígena N° 19.253 para eliminar la prohibición de arriendo de tierras indígenas, permitiendo a las personas indígenas arrendar sus bienes y asociarse libremente con terceros.\n" +
                    "Se considera una única propuesta clave y se menciona un insumo de la Comisión para la Paz y el Entendimiento.\n\n"+
                    "Infraestructura y Corredores bioceánicos\n"+
                    "Modificación al Reglamento del SEIA para establecer un procedimiento especial de evaluación acelerada para proyectos de corredores bioceánicos.\n" +
                    "Proponemos adoptar una Regla Fiscal de Inversión Pública que garantice una inversión progresiva segura en infraestructura pública hacia el 3,5% del PIB durante 10 años."
            ,


            partidoPolitico = "Partido de la Gente",
            foto = R.drawable.parisi
        ),
        Candidato(
            nombre = "José Antonio Kast",
            edad = 59,
            lugarNacimiento = "Santiago",
            nacionalidad = "Chilena",
            historialPolitico = "Candidaturas Presidenciales previas:" +
                    "\n- 2017 (4to Lugar)" +
                    "\n- 2021 (2do Lugar)",
            estudios = "Derecho - Pontificia Universidad Católica de Chile\n",
            propuestas = " Ministerio de Seguridad y Orden Público\n" +
                    "Creación de un ministerio especializado que coordine Carabineros, PDI y Fuerzas Armadas. Centralizar el mando civil en seguridad y dotar de mayores recursos operativos para enfrentar el crimen organizado.\n\n"+
                    " Plan “Chile Seguro”\n"+
                    "Programa integral de seguridad con presencia militar en fronteras y control territorial. Uso de Fuerzas Armadas para proteger infraestructura crítica y restablecer el orden en zonas con violencia rural o narcotráfico.\n\n"+
                    "Reforma del sistema judicial\n"+
                    "Cambiar las normas que permiten impunidad y falta de cumplimiento de penas. Endurecer condenas y eliminar beneficios carcelarios, junto con dar prioridad a la defensa de las víctimas sobre los delincuentes.\n\n"+
                    "Política migratoria estricta\n"+
                    "Control total de fronteras y deportación inmediata de inmigrantes ilegales. Cierre de pasos no habilitados con tecnología y barreras físicas, y expulsión automática de extranjeros que cometan delitos.\n\n"+
                    "Modernización de las Fuerzas Armadas\n"+
                    "Reforzar capacidades de defensa y control interno. Incrementar presupuesto y profesionalización militar, y asignarles un rol activo en seguridad interna en casos de emergencia.\n\n"+
                    " Reforma al sistema penitenciario\n" +
                    "Reestructurar las cárceles para aislar a delincuentes peligrosos y mejorar la gestión. Separación de presos de alta peligrosidad y fin del uso político de los indultos o beneficios.\n\n"+
                    "Apoyo irrestricto a Carabineros y PDI\n" +
                    "Fortalecer y proteger a las policías como instituciones del Estado. Reponer el principio de autoridad policial, y entregar respaldo jurídico y operativo ante el uso legítimo de la fuerza.\n\n"+
                    "Reforma económica y reducción del Estado\n" +
                    "Impulsar el crecimiento bajando impuestos y reduciendo el gasto público. Simplificar el sistema tributario y eliminar ministerios y programas duplicados para hacer el Estado más eficiente.\n\n"+
                    "Promoción del emprendimiento y la inversión\n" +
                    "Atraer inversión nacional y extranjera con reglas claras y libertad económica. Garantizar seguridad jurídica a los inversionistas y reducir trabas burocráticas y permisos.\n\n"+
                    "Reforma laboral proempleo\n" +
                    "Flexibilizar las jornadas y fortalecer la libertad sindical. Impulsar la contratación con menos cargas para las empresas y permitir mayor libertad de negociación entre empleadores y trabajadores.\n\n"+
                    "Fortalecimiento de la familia como núcleo social\n" +
                    "Eje central del modelo social. Apoyo a la maternidad y políticas de natalidad, junto con promoción de valores familiares en educación y políticas públicas.\n\n"+
                    "Educación basada en mérito y libertad de elección\n" +
                    "Defender la libre elección de colegios y universidades. Reforzar la educación particular subvencionada y enfocar el sistema público en calidad y disciplina.\n\n"+
                    "Reforma del sistema de salud\n" +
                    "Permitir que los ciudadanos elijan entre público y privado. Aumentar la libertad de elección de los pacientes y fortalecer la gestión hospitalaria con eficiencia privada.\n\n"+
                    "Política energética y medioambiental equilibrada\n" +
                    "Fomentar inversión en energías limpias sin frenar la producción. Compatibilizar desarrollo económico con sostenibilidad ambiental, y garantizar soberanía energética nacional.\n\n"+
                    " Reforma de pensiones y sistema solidario mixto\n" +
                    "Cambiar el modelo de AFP manteniendo la capitalización individual. Permitir competencia entre entidades públicas y privadas y dar libertad al trabajador para elegir dónde cotizar.\n\n"+
                    " Estado eficiente y digital\n" +
                    "Modernizar la gestión pública mediante tecnología. Digitalización masiva de trámites y reducción de burocracia, y evaluación periódica de desempeño en la función pública.\n\n"+
                    "Política de soberanía nacional y orden interno\n" +
                    "Reafirmar el principio de autoridad y el respeto a las instituciones. Recuperar el control territorial en todo el país y fortalecer el orgullo y la identidad nacional frente a injerencias externas.\n"
            ,
            partidoPolitico = "Partido Republicano de Chile",
            foto = R.drawable.kast
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
            propuestas = "Reforma integral del sistema penitenciario\n" +
                    "Profesionalizar la Gendarmería con mejor dotación, capacitación y condiciones laborales. Separar las funciones de seguridad y reinserción para mejorar la eficiencia y los resultados del sistema.\n\n"+
                    "Creación de una unidad especial para reos de alta peligrosidad\n" +
                    "Formar una unidad dentro de Gendarmería encargada de la custodia exclusiva de condenados de alta peligrosidad en recintos de máxima seguridad.\n\n"+
                    "Fortalecimiento institucional y combate a la corrupción\n" +
                    "Ampliar y fortalecer las unidades encargadas de prevenir, investigar y sancionar actos de corrupción dentro del sistema penitenciario y judicial.\n\n"+
                    " Modernización tecnológica del sistema de justicia penal\n" +
                    "Incorporar infraestructura tecnológica interoperable para integrar datos sobre seguridad, población penal y reinserción social, asegurando transparencia y eficiencia.\n\n"+
                    "Expulsión de extranjeros condenados por delitos de drogas\n" +
                    "Impulsar una ley que establezca la expulsión como pena sustitutiva para extranjeros condenados por delitos de la Ley 20.000, reduciendo el hacinamiento carcelario.\n\n"+
                    "Política permanente de salud mental para funcionarios penitenciarios\n" +
                    "Implementar programas de apoyo psicológico y bienestar laboral, siguiendo recomendaciones del Servicio Civil y SENDA\n\n"+
                    "Sistema de formación continua y profesionalización estatal\n" +
                    "Crear una escuela nacional de formación y carrera funcionaria que eleve los estándares de gestión y profesionalismo del Estado.\n\n"+
                    "Fortalecimiento del sistema de seguridad social\n" +
                    "Consolidar un sistema de pensiones público, solidario y sostenible, disminuyendo la dependencia del sistema privado de AFP.\n\n" +
                    " Fortalecimiento de la salud pública\n" +
                    "Mejorar el acceso y la calidad de atención en el sistema público de salud, con énfasis en la atención primaria, la salud mental y la reducción de listas de espera.\n\n" +
                    "Sistema Nacional de Cuidados\n" +
                    "Crear una red pública de cuidados para niños, personas mayores y personas con discapacidad, promoviendo la igualdad de género y la corresponsabilidad familiar.\n\n" +
                    " Igualdad laboral y conciliación trabajo-familia\n" +
                    "Desarrollar políticas para garantizar la igualdad salarial, el teletrabajo con derechos y medidas de conciliación entre la vida laboral y personal.\n\n" +
                    "Vivienda y desarrollo urbano digno\n" +
                    "Impulsar un plan nacional de vivienda social que promueva barrios integrados, sostenibles y con acceso equitativo a servicios y transporte.\n\n" +
                    "Sostenibilidad ambiental y transición energética\n" +
                    "Fomentar una matriz energética limpia mediante inversiones en energías renovables, eficiencia energética y gestión sostenible del agua.\n\n" +
                    "Participación ciudadana y democracia local\n" +
                    "Fortalecer mecanismos como presupuestos participativos, cabildos y consultas comunales para aumentar la participación directa de la ciudadanía.\n\n" +
                    "Política fiscal responsable y progresiva\n" +
                    "Mantener la estabilidad macroeconómica impulsando una reforma tributaria que haga el sistema más progresivo, equitativo y sostenible.\n\n" +
                    "Impulso al empleo y reactivación económica\n" +
                    "Apoyar a las pymes y cooperativas, promover empleos verdes y fomentar la formalización laboral con equidad territorial.\n\n" +
                    "Gobierno transparente y eficiente\n" +
                    "Implementar mecanismos efectivos de rendición de cuentas y control ciudadano, fortaleciendo la probidad y la eficiencia del aparato estatal.\n",
            partidoPolitico = "Partido Comunista de Chile",
            foto = R.drawable.jara
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
            estudios = "Literatura - Universidad de Chile",
            propuestas = " Economía y Empleo: Nueva Alianza entre el Estado y el Mercado\n" +
                    " Reducción moderada de la tasa de impuesto corporativo al 20% para PYMES y grandes empresas , sujeta a estar al día en cotizaciones y reinvertir utilidades. Establecimiento de un IVA diferenciado para alimentos/medicamentos/libros (10%) y servicios de PYMES (15%).\n" +
                    "Aplicar un impuesto del 0,5% anual a patrimonios líquidos superiores a US\$ 5 millones , que no gravará empresas productivas. Transformar BancoEstado para que actúe sistemática y estratégicamente financiando innovación verde y apoyando a PYMES.\n\n" +
                    "Seguridad Pública: Barrios en Paz, Estado con Inteligencia\n" +
                    "Pasar de un modelo reactivo a uno predictivo mediante la integración obligatoria de bases de datos de las seis agencias de seguridad , y articulación de inteligencia humana, financiera, y digital.\n" +
                    "Intervención integral y multisectorial en 400 zonas de alta conflictividad , con presencia policial comunitaria reforzada. Las FF.AA. asumirían permanentemente la protección de 120 infraestructuras críticas , liberando a Carabineros y PDI para labores de prevención e investigación.\n\n" +
                    "Salud: Sistema Universal, Justo y Eficiente\n" +
                    "Eliminar el IVA a los medicamentos , fijar límites de precios para medicamentos esenciales , y realizar compras conjuntas con otros países.\n" +
                    "Transformar FONASA en un pagador único e implementar un Plan de Salud Universal Garantizado. Aumentar el gasto del 5,8% al 6,3% del PIB en cuatro años , para mejorar infraestructura hospitalaria y atención primaria.\n\n" +
                    "Educación: Excelencia y Equidad para la Prosperidad\n" +
                    "Formar jóvenes con altos conocimientos tecnológicos y de innovación , alineados con los clústeres productivos regionales (economía azul, energía, robótica, etc.).\n" +
                    "Garantizar una cobertura universal y gratuita para niños de 2 a 6 años , creando 150.000 nuevos cupos para combatir las desigualdades educativas desde la primera infancia.\n\n" +
                    " Transición Verde y Conservación de Ecosistemas Estratégicos\n" +
                    "Impedir el desarrollo de nuevos proyectos extractivos en glaciares, salares, humedales y bosques relictos hasta contar con una Zonificación Ecológica Participativa Nacional.\n" +
                    "Crear una Agencia Nacional del Agua con competencias para priorizar el consumo humano y el equilibrio ecológico. Implementar un impuesto al uso intensivo del agua en minería, agroindustria y forestales , con exención para pequeños regantes.\n\n" +
                    " Pensiones: Solidaridad Intergeneracional, Crecimiento y Equidad\n" +
                    "Aumentar la pensión mínima garantizada a \$210.000 CLP (aprox. 230 USD) en el Año 1 (2026) , alcanzando \$250.000 CLP (aprox. 275 USD) en el Año 3 (2028) , beneficiando a más de 2,3 millones de personas\n" +
                    "Establecer un sistema público y sin fines de lucro con cuentas nacionales individuales de derechos previsionales. Los cotizantes podrán optar libremente por traspasar sus ahorros a la gestión pública , y las AFP dejarán de administrar cotizaciones obligatorias.\n",
            partidoPolitico = "Independiente",
            foto = R.drawable.meo
        ),
        Candidato(
            nombre = "Johannes Kaiser Barents von Hohenhagen",
            edad = 49,
            lugarNacimiento = "Santiago de Chile",
            nacionalidad = "Chilena",
            historialPolitico = "Diputado de la República de Chile\n",
            estudios = "Derecho - Universidad Finnis Terrae (Incompleta)\n" +
                    "Derecho - Universidad de Heidelberg (Incompleta)\n",
            propuestas = "Batalla Cultural\n" +
                    "Recuperar el lenguaje y rechazar la intromisión ideológica: Recuperar el lenguaje tradicional (Español) sin deformaciones progresistas. Rechazar la intromisión del Estado en la crianza, educación y enseñanza, reafirmando la autoridad de los padres y el valor del matrimonio religioso.\n" +
                    "Estimular la participación Privada en la Cultura: Impulsar reformas legales (nueva Ley de mecenazgo ciudadano) para que el sector privado se incorpore en el desarrollo cultural, reduciendo la dependencia estatal. Los recursos públicos se asignarán según los principios rectores de la cultura chilena y la filosofía cristiano occidental.\n\n" +
                    "Programa Económico de Sentido Común (Hacienda)\n" +
                    "Reforma Tributaria Pro-Emprendimiento (0% a utilidades reinvertidas): Toda utilidad que se reinvierta en la empresa (ampliación, maquinaria, contratación, I+D) pagará 0% de impuesto corporativo. Solo se aplicará un impuesto único del 15% a las utilidades retiradas por los dueños para consumo personal.\n" +
                    "Eliminación del Impuesto Territorial (Contribuciones) y de la Doble Tributación Interna: Eliminar completamente el Impuesto Territorial (Contribuciones) para toda propiedad (principal o secundaria, urbana o rural). Implementar un sistema 100% integrado donde el impuesto pagado por la empresa se acredite completamente al dueño, poniendo fin a la doble tributación.\n\n" +
                    "Salud: Atención Oportuna, de Calidad y Calidez\n" +
                    "Reducir a Cero las Listas de Espera Oncológicas GES en 70 días y Resolución de Consultas Atrasadas: Meta de reducir a cero las patologías GES oncológicas confirmadas y atrasadas (4.500 pacientes) en 70 días de gobierno. La resolución se logrará mediante la utilización del 12.5% de los hospitales base o, en caso de no poder, vendiendo la prestación al sector privado a valor PAD.\n" +
                    "Implementación de Ficha Clínica Única y Cooperativas de Salud: Implementar un sistema único digital para unificar el sistema de salud público a nivel nacional (100% de 200 hospitales base en 1 año). Impulsar un sistema de trabajo mediante cooperativas en el sector público de salud, con la participación de colegios profesionales y asociaciones de funcionarios.\n\n" +
                    "Seguridad y Defensa\n" +
                    "Fortalecer la Presencia en Fronteras y penalizar el Ingreso Ilegal: Presencia efectiva en fronteras con tecnología avanzada (vigilancia satelital, drones) y equipos inter-agenciales (policías, militares, aduana). Volver a penalizar el ingreso por pasos no habilitados, deteniendo y confinando a los infractores mientras se tramita su expulsión.\n" +
                    "Incremento de Dotación y Restablecer el Estado de Derecho: Incrementar en 6.000 Carabineros y 1.600 Detectives en cuatro años, superando los 20.000 nuevos funcionarios con la reintegración de personal retirado. Restablecer el Estado de Derecho en zonas tomadas por el narcoterrorismo (Provincias de Arauco y Malleco) mediante ocupación efectiva de los territorios antes del año 2028.\n\n" +
                    "Sistema de Justicia\n" +
                    "Sistema de Sorteo para Nombramiento de Ministros de Cortes Superiores: Reforma constitucional y legislativa para que los nuevos Ministros de Cortes de Apelaciones y la Corte Suprema sean sorteados de entre una nómina de postulantes habilitados que reúnan los requisitos de antigüedad y mérito.\n" +
                    "Creación del Consejo de la Magistratura y la Jurisdicción de Probidad: Crear un Consejo de la Magistratura (órgano autónomo) para gestionar la administración, carrera, y control disciplinario del Poder Judicial, liberando a los jueces de funciones no jurisdiccionales. Crear una Jurisdicción de Probidad (Tribunal Penal Especial autónomo) para investigar y juzgar delitos contra la probidad cometidos por funcionarios judiciales y del sistema de justicia.\n\n" +
                    " Relaciones Internacionales\n" +
                    "Supremacía de la Soberanía Chilena y Bilateralismo: El primer principio rector es la supremacía de la soberanía chilena por sobre el transnacionalismo, anteponiendo el interés nacional ante resoluciones de organismos internacionales. Se priorizará el bilateralismo en las relaciones políticas, económicas y culturales, buscando el mayor beneficio mutuo.\n" +
                    "Prioridad Antártica y Suspensión de Ayuda a Bolivia: Priorizar la Política Antártica con inversión en investigación, infraestructura, y el fortalecimiento de la presencia de Chile. Suspender toda ayuda y cooperación a Bolivia hasta que se rectifique la práctica de ese Estado de facilitar el tránsito ilícito de inmigrantes.\n\n" +
                    "Desarrollo Humano\n" +
                    "Ahorro Previsional al Nacer y Reforma del Sistema Laboral: Realizar un depósito inicial de \$2.000.000 CLP en una cuenta individual para cada recién nacido, invertido a largo plazo para reducir la dependencia futura de subsidios estatales. Sustituir la indemnización por años de servicio por un Seguro de Cesantía fortalecido.\n" +
                    "Comunidades de Aprendizaje en Familia para combatir el crimen: Crear comunidades de aprendizaje en escuelas y liceos de barrios vulnerables para alejar a niños y adolescentes del crimen organizado. Se enfoca en luchar contra la drogadicción y delincuencia desde las familias, con apoyo integral (alimentación, uniformes, becas, etc.) condicionado al esfuerzo académico.\n\n" +
                    " Minería\n" +
                    "Acelerar Drásticamente los Permisos Mineros e Invariabilidad de la RCA: Proyectos de pequeña minería se aprobarán en 1 mes y grandes proyectos (sobre US\$500 millones) entre 6 a 9 meses. Se exigirá una Boleta de Garantía de fiel cumplimiento de la RCA y se prohibirá a tribunales invalidar lo establecido en la RCA, fortaleciendo la certeza jurídica.\n" +
                    "Creación de un Fondo Soberano Minero y Nuevo Royalty Minero: Crear un Fondo Soberano Minero que acumule el 70% de la recaudación del royalty. Reemplazar el royalty actual por uno único ad valorem del 3.5% sobre el valor de todas las exportaciones mineras.\n\n" +
                    "Infraestructura\n" +
                    "Plan Estratégico para Inversión 100% Privada en Obras Públicas: Implementar un plan para que nuevas obras públicas se financien al 100% con inversión privada, sin gasto fiscal ni compromisos financieros del Estado. Esto incluye suprimir la figura del \"ingreso mínimo garantizado\" en concesiones.\n" +
                    "Ventanilla Única para Proyectos de Infraestructura y Desalinización: Crear una plataforma unificada y digital para gestionar, aprobar y supervisar proyectos, reduciendo tiempos y burocracia. Se establecerá un marco normativo que incentive la inversión en plantas desalinizadoras y el uso de energías renovables para enfrentar la crisis hídrica.\n\n" +
                    "",
            partidoPolitico = "Partido Nacional Libertario",
            foto = R.drawable.kaiser
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
            estudios = "Derecho - Universidad Finnis Terrae (Incompleta)\n" +
                    "Derecho - Universidad de Heidelberg (Incompleta)\n",
            propuestas = "Batalla Cultural\n" +
                    "Recuperar el lenguaje y rechazar la intromisión ideológica: Recuperar el lenguaje tradicional (Español) sin deformaciones progresistas. Rechazar la intromisión del Estado en la crianza, educación y enseñanza, reafirmando la autoridad de los padres y el valor del matrimonio religioso.\n" +
                    "Estimular la participación Privada en la Cultura: Impulsar reformas legales (nueva Ley de mecenazgo ciudadano) para que el sector privado se incorpore en el desarrollo cultural, reduciendo la dependencia estatal. Los recursos públicos se asignarán según los principios rectores de la cultura chilena y la filosofía cristiano occidental.\n\n" +
                    "Programa Económico de Sentido Común (Hacienda)\n" +
                    "Reforma Tributaria Pro-Emprendimiento (0% a utilidades reinvertidas): Toda utilidad que se reinvierta en la empresa (ampliación, maquinaria, contratación, I+D) pagará 0% de impuesto corporativo. Solo se aplicará un impuesto único del 15% a las utilidades retiradas por los dueños para consumo personal.\n" +
                    "Eliminación del Impuesto Territorial (Contribuciones) y de la Doble Tributación Interna: Eliminar completamente el Impuesto Territorial (Contribuciones) para toda propiedad (principal o secundaria, urbana o rural). Implementar un sistema 100% integrado donde el impuesto pagado por la empresa se acredite completamente al dueño, poniendo fin a la doble tributación.\n\n" +
                    "Salud: Atención Oportuna, de Calidad y Calidez\n" +
                    "Reducir a Cero las Listas de Espera Oncológicas GES en 70 días y Resolución de Consultas Atrasadas: Meta de reducir a cero las patologías GES oncológicas confirmadas y atrasadas (4.500 pacientes) en 70 días de gobierno. La resolución se logrará mediante la utilización del 12.5% de los hospitales base o, en caso de no poder, vendiendo la prestación al sector privado a valor PAD.\n" +
                    "Implementación de Ficha Clínica Única y Cooperativas de Salud: Implementar un sistema único digital para unificar el sistema de salud público a nivel nacional (100% de 200 hospitales base en 1 año). Impulsar un sistema de trabajo mediante cooperativas en el sector público de salud, con la participación de colegios profesionales y asociaciones de funcionarios.\n\n" +
                    "Seguridad y Defensa\n" +
                    "Fortalecer la Presencia en Fronteras y penalizar el Ingreso Ilegal: Presencia efectiva en fronteras con tecnología avanzada (vigilancia satelital, drones) y equipos inter-agenciales (policías, militares, aduana). Volver a penalizar el ingreso por pasos no habilitados, deteniendo y confinando a los infractores mientras se tramita su expulsión.\n" +
                    "Incremento de Dotación y Restablecer el Estado de Derecho: Incrementar en 6.000 Carabineros y 1.600 Detectives en cuatro años, superando los 20.000 nuevos funcionarios con la reintegración de personal retirado. Restablecer el Estado de Derecho en zonas tomadas por el narcoterrorismo (Provincias de Arauco y Malleco) mediante ocupación efectiva de los territorios antes del año 2028.\n\n" +
                    "Sistema de Justicia\n" +
                    "Sistema de Sorteo para Nombramiento de Ministros de Cortes Superiores: Reforma constitucional y legislativa para que los nuevos Ministros de Cortes de Apelaciones y la Corte Suprema sean sorteados de entre una nómina de postulantes habilitados que reúnan los requisitos de antigüedad y mérito.\n" +
                    "Creación del Consejo de la Magistratura y la Jurisdicción de Probidad: Crear un Consejo de la Magistratura (órgano autónomo) para gestionar la administración, carrera, y control disciplinario del Poder Judicial, liberando a los jueces de funciones no jurisdiccionales. Crear una Jurisdicción de Probidad (Tribunal Penal Especial autónomo) para investigar y juzgar delitos contra la probidad cometidos por funcionarios judiciales y del sistema de justicia.\n\n" +
                    " Relaciones Internacionales\n" +
                    "Supremacía de la Soberanía Chilena y Bilateralismo: El primer principio rector es la supremacía de la soberanía chilena por sobre el transnacionalismo, anteponiendo el interés nacional ante resoluciones de organismos internacionales. Se priorizará el bilateralismo en las relaciones políticas, económicas y culturales, buscando el mayor beneficio mutuo.\n" +
                    "Prioridad Antártica y Suspensión de Ayuda a Bolivia: Priorizar la Política Antártica con inversión en investigación, infraestructura, y el fortalecimiento de la presencia de Chile. Suspender toda ayuda y cooperación a Bolivia hasta que se rectifique la práctica de ese Estado de facilitar el tránsito ilícito de inmigrantes.\n\n" +
                    "Desarrollo Humano\n" +
                    "Ahorro Previsional al Nacer y Reforma del Sistema Laboral: Realizar un depósito inicial de \$2.000.000 CLP en una cuenta individual para cada recién nacido, invertido a largo plazo para reducir la dependencia futura de subsidios estatales. Sustituir la indemnización por años de servicio por un Seguro de Cesantía fortalecido.\n" +
                    "Comunidades de Aprendizaje en Familia para combatir el crimen: Crear comunidades de aprendizaje en escuelas y liceos de barrios vulnerables para alejar a niños y adolescentes del crimen organizado. Se enfoca en luchar contra la drogadicción y delincuencia desde las familias, con apoyo integral (alimentación, uniformes, becas, etc.) condicionado al esfuerzo académico.\n\n" +
                    "Minería\n" +
                    "Acelerar Drásticamente los Permisos Mineros e Invariabilidad de la RCA: Proyectos de pequeña minería se aprobarán en 1 mes y grandes proyectos (sobre US\$500 millones) entre 6 a 9 meses. Se exigirá una Boleta de Garantía de fiel cumplimiento de la RCA y se prohibirá a tribunales invalidar lo establecido en la RCA, fortaleciendo la certeza jurídica.\n" +
                    "Creación de un Fondo Soberano Minero y Nuevo Royalty Minero: Crear un Fondo Soberano Minero que acumule el 70% de la recaudación del royalty. Reemplazar el royalty actual por uno único ad valorem del 3.5% sobre el valor de todas las exportaciones mineras.\n\n" +
                    "Infraestructura\n" +
                    "Plan Estratégico para Inversión 100% Privada en Obras Públicas: Implementar un plan para que nuevas obras públicas se financien al 100% con inversión privada, sin gasto fiscal ni compromisos financieros del Estado. Esto incluye suprimir la figura del \"ingreso mínimo garantizado\" en concesiones.\n" +
                    "Ventanilla Única para Proyectos de Infraestructura y Desalinización: Crear una plataforma unificada y digital para gestionar, aprobar y supervisar proyectos, reduciendo tiempos y burocracia. Se establecerá un marco normativo que incentive la inversión en plantas desalinizadoras y el uso de energías renovables para enfrentar la crisis hídrica.\n",
            partidoPolitico = "Partido Comunista Chileno (Acción Proletaria)",
            foto = R.drawable.artes
        ),
        Candidato(
            nombre = "Evelyn Matthei Fornet",
            edad = 71,
            lugarNacimiento = "Santiago de Chile",
            nacionalidad = "Chilena",
            historialPolitico = "Candidaturas Presidenciales previas: \n" +
                    "2013 (2do Lugar)\n" +
                    "Ministra del Trabajo y Previsión Social de Chile\n" +
                    "Senadora de la República de Chile\n" +
                    "Diputada de la República de Chile\n" +
                    "Alcaldesa de Providencia\n",
            estudios = "Ingeniería Comercial - Pontificia Universidad Católica de Chile\n",
            propuestas = " Estrategia Integral de Seguridad Nacional\n" +
                    "Coordinar a todas las instituciones del Estado (policías, FF.AA., Gendarmería, Aduanas, SII, ANI, Ministerio Público) para combatir el crimen organizado y recuperar el control del territorio, con una inversión inicial de US\$2.500 millones.\n\n" +
                    "Aumento de dotación policial y modernización tecnológica\n" +
                    "Incrementar en 10.000 carabineros y dotarlos de cámaras inteligentes, drones, pórticos de reconocimiento y sistemas de inteligencia artificial para prevenir delitos.\n\n" +
                    " Recuperar el control de las cárceles\n" +
                    "Construir cinco nuevas cárceles, tres de alta seguridad, aislar a líderes criminales y expulsar a 3.000 extranjeros condenados. Gendarmería pasará a depender del Ministerio de Seguridad.\n\n" +
                    "Blindaje de fronteras e inmigración controlada\n" +
                    "Crear una Policía Militar Fronteriza, instalar barreras físicas y sensores, y construir dos centros de expulsión con tecnología biométrica. Se eliminarán privilegios a migrantes irregulares y se sancionará a quienes los contraten.\n\n" +
                    " Lucha contra la corrupción y el narcotráfico institucional\n" +
                    "Fortalecer los controles internos en FF.AA., Carabineros y Poder Judicial; crear una Fiscalía de Asuntos Internos y modernizar el Ministerio Público con una Fiscalía Supraterritorial especializada.\n\n" +
                    "Reforma al sistema judicial\n" +
                    "Dividir el gobierno judicial en tres organismos autónomos (nombramientos, administración y formación) y crear una Defensoría de las Víctimas con asesoría legal, psicológica y social.\n\n" +
                    "Crecimiento económico sostenido al 4% anual\n" +
                    "Bajar el impuesto corporativo al 23% (y al 18% en 10 años), reducir el gasto público en US\$8 mil millones, eliminar la “permisología” y crear contratos tributarios estables por 20 años.\n\n" +
                    "Creación de 1.000.000 de empleos formales\n" +
                    "Impulsar empleos de calidad, especialmente para mujeres, jóvenes y adultos mayores, promoviendo la formalización laboral y un sistema flexible de jornadas anuales o por horas.\n\n" +
                    "Política activa de equidad de género\n" +
                    "Programa “Mujer camina tranquila” para seguridad en espacios públicos, red de protección a víctimas de violencia, brazalete de emergencia, acceso prioritario a viviendas y sala cuna universal.\n\n" +
                    "Reforma del sistema de salud\n" +
                    "Plan nacional para reducir listas de espera, construir 100 CESFAMs y 30 hospitales nuevos, ampliar telemedicina y declarar alerta sanitaria oncológica con horarios extendidos y mamógrafos móviles.\n\n" +
                    "Plan Nacional de Vivienda\n" +
                    "Construir 400 mil viviendas nuevas y mejorar otras 400 mil, priorizando terrenos públicos y barrios integrados con servicios y transporte.\n\n" +
                    "Educación con foco en calidad y libertad de elección\n" +
                    "Recuperar aprendizajes post pandemia, fortalecer la educación técnico-profesional, reducir la burocracia escolar y devolver a las familias el derecho a elegir la educación de sus hijos.\n\n" +
                    "Pacto de desarrollo productivo\n" +
                    "Promover sectores estratégicos (minería, energía, agricultura, forestal, turismo y tecnología), modernizar la Dirección General de Aguas y lanzar un Plan Nacional de Desalación y Embalses.\n\n" +
                    "Estrategia Nacional de Ciencia, Tecnología e Innovación\n" +
                    "Fomentar la investigación aplicada, el uso de inteligencia artificial y la formación digital; crear un Compromiso Espacial Nacional con satélites de observación y comunicaciones.\n\n" +
                    "Política de defensa moderna y autónoma\n" +
                    "Reforzar las capacidades estratégicas de las Fuerzas Armadas, modernizar el servicio militar y desarrollar la industria nacional de defensa con FAMAE, ASMAR y ENAER.\n\n" +
                    " Estado eficiente y sin corrupción\n" +
                    "Aplicar auditorías, digitalización masiva de trámites, meritocracia en el servicio público, eliminación de programas ineficaces y fortalecimiento de la Contraloría.\n\n" +
                    "",
            partidoPolitico = "Unión Demócrata Independiente",
            foto = R.drawable.matthei
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
            foto = R.drawable.maynenicholls
        )
    )
}