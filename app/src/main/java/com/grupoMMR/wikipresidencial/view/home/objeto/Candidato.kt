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
            propuestas =
                    "Administración Pública\n"+
                    "Modificar el sistema de evaluación de programas estatales de DIPRES, aumentando el peso de los indicadores de eficiencia (30%)," +
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
                    "Crear un ministerio especializado que coordine Carabineros, PDI y Fuerzas Armadas bajo un mando civil unificado.\n" +
                    "Centralizar la gestión operativa y asignar mayores recursos para enfrentar el crimen organizado.\n\n" +
                    "\nPlan “Chile Seguro”\n" +
                    "Implementar un programa integral de seguridad con presencia militar en fronteras y control territorial reforzado.\n" +
                    "Utilizar Fuerzas Armadas para proteger infraestructura crítica y apoyar el restablecimiento del orden en zonas de violencia rural o narcotráfico.\n" +
                    "\nReforma del sistema judicial\n" +
                    "Modificar normas que permiten impunidad y baja efectividad en el cumplimiento de penas.\n" +
                    "Endurecer condenas, eliminar beneficios carcelarios y priorizar la protección de víctimas por sobre los agresores.\n" +
                    "\nPolítica migratoria estricta\n" +
                    "Establecer control total de fronteras y deportación inmediata de inmigrantes ilegales.\n" +
                    "Cerrar pasos no habilitados mediante tecnología y barreras físicas, y expulsar automáticamente a extranjeros que cometan delitos.\n" +
                    "\nModernización de las Fuerzas Armadas\n" +
                    "Reforzar capacidades de defensa, control interno y respuesta rápida.\n" +
                    "Incrementar presupuesto, profesionalización y su rol en seguridad interna en situaciones de emergencia.\n" +
                    "\nReforma al sistema penitenciario\n" +
                    "Reestructurar las cárceles para aislar delincuentes peligrosos y mejorar la gestión interna.\n" +
                    "Separar a reos de alta peligrosidad y poner fin al uso político de indultos o beneficios.\n" +
                    "\nApoyo irrestricto a Carabineros y PDI\n" +
                    "Fortalecer y proteger a las policías como instituciones fundamentales del Estado.\n" +
                    "Restablecer la autoridad policial y otorgar respaldo jurídico ante el uso legítimo de la fuerza.\n" +
                    "\nReforma económica y reducción del Estado\n" +
                    "Impulsar el crecimiento mediante baja de impuestos y reducción del gasto público.\n" +
                    "Simplificar el sistema tributario y eliminar ministerios o programas duplicados para mejorar la eficiencia estatal.\n" +
                    "\nPromoción del emprendimiento y la inversión\n" +
                    "Atraer inversión nacional y extranjera con reglas claras y un entorno de libertad económica.\n" +
                    "Garantizar seguridad jurídica y disminuir trabas burocráticas y tiempos de permisos.\n" +
                    "\nReforma laboral proempleo\n" +
                    "Flexibilizar jornadas de trabajo y fortalecer la libertad sindical.\n" +
                    "Impulsar la contratación con menores cargas para las empresas y permitir mayor libertad de negociación entre partes.\n" +
                    "\nFortalecimiento de la familia como núcleo social\n" +
                    "Poner a la familia como eje de las políticas sociales del país.\n" +
                    "Apoyar maternidad, natalidad y promover valores familiares en educación y programas públicos.\n" +
                    "\nEducación basada en mérito y libertad de elección\n" +
                    "Defender la libre elección de colegios y universidades por parte de las familias.\n" +
                    "Reforzar la educación particular subvencionada y mejorar la calidad y disciplina del sistema público.\n" +
                    "\nReforma del sistema de salud\n" +
                    "Permitir que los ciudadanos elijan libremente entre salud pública y privada.\n" +
                    "Aumentar la eficiencia hospitalaria aplicando modelos de gestión del sector privado.\n" +
                    "\nPolítica energética y medioambiental equilibrada\n" +
                    "Fomentar inversiones en energías limpias sin frenar la actividad productiva.\n" +
                    "Compatibilizar desarrollo económico con sostenibilidad ambiental y asegurar soberanía energética.\n" +
                    "\nReforma de pensiones y sistema solidario mixto\n" +
                    "Mantener la capitalización individual como base del sistema previsional.\n" +
                    "Permitir competencia entre entidades públicas y privadas para que el trabajador elija dónde cotizar.\n" +
                    "\nEstado eficiente y digital\n" +
                    "Modernizar la gestión pública mediante tecnologías avanzadas.\n" +
                    "Digitalizar trámites masivamente y establecer evaluaciones periódicas de desempeño en el empleo público.\n" +
                    "\nPolítica de soberanía nacional y orden interno\n" +
                    "Reafirmar la autoridad del Estado y el respeto por las instituciones.\n" +
                    "Recuperar el control territorial en todo el país y fortalecer la identidad nacional ante amenazas o injerencias externas.\n"
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
                    "Profesionalizar la Gendarmería mediante mejor dotación, capacitación y condiciones laborales.\n" +
                    "Separar las funciones de seguridad y reinserción para mejorar la eficiencia del sistema.\n\n" +
                    "Creación de una unidad especial para reos de alta peligrosidad\n" +
                    "Formar una unidad especializada dentro de Gendarmería para la custodia exclusiva de condenados de alta peligrosidad.\n" +
                    "Garantizar estándares de máxima seguridad en recintos diseñados para este propósito.\n" +
                    "\nFortalecimiento institucional y combate a la corrupción\n" +
                    "Ampliar y robustecer las unidades encargadas de prevenir, investigar y sancionar actos de corrupción.\n" +
                    "Implementar mecanismos de control interno más estrictos en el sistema penitenciario y judicial.\n" +
                    "\nModernización tecnológica del sistema de justicia penal\n" +
                    "Incorporar infraestructura interoperable que integre datos sobre seguridad, población penal y reinserción.\n" +
                    "Asegurar mayor transparencia y trazabilidad mediante sistemas tecnológicos modernos.\n" +
                    "\nExpulsión de extranjeros condenados por delitos de drogas\n" +
                    "Impulsar una ley que permita la expulsión como pena sustitutiva para extranjeros que infrinjan la Ley 20.000.\n" +
                    "Contribuir a descongestionar recintos penitenciarios mediante esta medida.\n" +
                    "\nPolítica permanente de salud mental para funcionarios penitenciarios\n" +
                    "Implementar programas de apoyo psicológico para funcionarios.\n" +
                    "Desarrollar políticas de bienestar laboral basadas en recomendaciones del Servicio Civil y SENDA.\n" +
                    "\nSistema de formación continua y profesionalización estatal\n" +
                    "Crear una escuela nacional de formación y carrera funcionaria.\n" +
                    "Elevar los estándares de gestión, liderazgo y profesionalismo dentro del Estado.\n" +
                    "\nFortalecimiento del sistema de seguridad social\n" +
                    "Consolidar un sistema de pensiones público, solidario y sostenible.\n" +
                    "Reducir la dependencia del sistema privado de AFP mediante mecanismos de protección social más equitativos.\n" +
                    "\nFortalecimiento de la salud pública\n" +
                    "Mejorar el acceso y la calidad de la atención en el sistema público de salud.\n" +
                    "Priorizar la atención primaria, la salud mental y la reducción de listas de espera.\n" +
                    "\nSistema Nacional de Cuidados\n" +
                    "Crear una red pública de cuidados para niños, personas mayores y personas con discapacidad.\n" +
                    "Promover la igualdad de género y la corresponsabilidad en el trabajo doméstico y de cuidados.\n" +
                    "\nIgualdad laboral y conciliación trabajo–familia\n" +
                    "Garantizar igualdad salarial y condiciones dignas en modalidades como el teletrabajo.\n" +
                    "Impulsar medidas que faciliten la conciliación entre vida laboral, familiar y personal.\n" +
                    "\nVivienda y desarrollo urbano digno\n" +
                    "Impulsar un plan nacional de vivienda social con barrios integrados y sostenibles.\n" +
                    "Asegurar acceso equitativo a servicios básicos y transporte público.\n" +
                    "\nSostenibilidad ambiental y transición energética\n" +
                    "Fomentar inversiones en energías renovables y eficiencia energética.\n" +
                    "Promover el uso responsable y sostenible del agua.\n" +
                    "\nParticipación ciudadana y democracia local\n" +
                    "Fortalecer mecanismos como presupuestos participativos, cabildos y consultas comunales.\n" +
                    "Ampliar espacios para que la ciudadanía influya directamente en decisiones locales.\n" +
                    "\nPolítica fiscal responsable y progresiva\n" +
                    "Desarrollar una reforma tributaria que haga el sistema más justo y progresivo.\n" +
                    "Mantener la estabilidad macroeconómica y la sostenibilidad del gasto público.\n" +
                    "\nImpulso al empleo y reactivación económica\n" +
                    "Apoyar a pymes y cooperativas para dinamizar la economía.\n" +
                    "Promover empleos verdes y la formalización laboral con enfoque territorial.\n" +
                    "\nGobierno transparente y eficiente\n" +
                    "Implementar mecanismos efectivos de rendición de cuentas y control ciudadano.\n" +
                    "Fortalecer la probidad y mejorar la eficiencia del aparato estatal.\n" ,
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
            propuestas = "Nueva Constitución soberana y popular\n" +
                    "Impulsar una Asamblea Constituyente elegida íntegramente por el pueblo y libre de influencia del poder económico.\n" +
                    "Reemplazar la Constitución de 1980 para establecer un Estado socialista, plurinacional y plenamente soberano.\n" +
                    "\nNacionalización de los recursos naturales\n" +
                    "Recuperar para el Estado el control del cobre, litio, agua, pesca y energía.\n" +
                    "Expropiar sin indemnización a grandes empresas extractivas y crear empresas estatales dirigidas por los trabajadores.\n" +
                    "\nReforma agraria y soberanía alimentaria\n" +
                    "Redistribuir tierras agrícolas concentradas en grandes conglomerados económicos.\n" +
                    "Expropiar latifundios y entregarlos a cooperativas campesinas para fortalecer la producción de alimentos sanos.\n" +
                    "\nSistema económico socialista\n" +
                    "Reemplazar el modelo capitalista por una economía planificada y dirigida por el Estado.\n" +
                    "Priorizar empleo y producción nacional por sobre el lucro privado y la especulación financiera.\n" +
                    "\nNacionalización de la banca y las finanzas\n" +
                    "Transformar el sistema financiero en un banco estatal único.\n" +
                    "Eliminar la banca privada y destinar el crédito al desarrollo industrial, agrícola y habitacional.\n" +
                    "\nPolítica exterior antiimperialista\n" +
                    "Romper con tratados que subordinen al país al capital extranjero.\n" +
                    "Retirar a Chile de organismos como el FMI y Banco Mundial, fortaleciendo alianzas con países socialistas y latinoamericanos.\n" +
                    "\nEducación pública, gratuita y estatal\n" +
                    "Eliminar el lucro y la educación privada subvencionada.\n" +
                    "Crear un sistema único nacional de educación pública con gratuidad desde preescolar hasta la educación superior.\n" +
                    "\nSalud pública universal\n" +
                    "Eliminar las isapres y establecer un sistema único estatal de salud.\n" +
                    "Garantizar atención gratuita y fortalecer hospitales y la atención primaria con inversión pública.\n" +
                    "\nVivienda digna como derecho\n" +
                    "Implementar un plan nacional de construcción masiva de viviendas populares.\n" +
                    "Asumir desde el Estado la edificación y planificación urbana, evitando la especulación inmobiliaria.\n" +
                    "\nSistema previsional solidario y estatal\n" +
                    "Eliminar las AFP y crear un fondo nacional único de pensiones.\n" +
                    "Establecer aportes tripartitos y asegurar pensiones suficientes y dignas para todas las personas.\n" +
                    "\nDemocratización del trabajo\n" +
                    "Transformar empresas en propiedad social o cooperativa.\n" +
                    "Garantizar gestión directa de los trabajadores y producción basada en necesidades nacionales.\n" +
                    "\nIgualdad de género y derechos de las mujeres\n" +
                    "Promover igualdad plena en ámbitos laborales, educativos y políticos.\n" +
                    "Crear un sistema nacional de cuidados con responsabilidad compartida del Estado.\n" +
                    "\nDefensa de los pueblos originarios\n" +
                    "Reconocer constitucionalmente a las naciones originarias y su autonomía territorial.\n" +
                    "Garantizar control sobre sus recursos y formas propias de organización y gobierno.\n" +
                    "\nPolítica cultural nacional y popular\n" +
                    "Impulsar una cultura orientada al desarrollo popular y comunitario.\n" +
                    "Fomentar las artes y medios independientes que reflejen identidad y conciencia nacional.\n" +
                    "\nFuerzas Armadas y seguridad soberanas\n" +
                    "Reformar íntegramente las FF.AA. para ponerlas al servicio del pueblo.\n" +
                    "Erradicar doctrinas represivas y dependencias militares externas.\n" +
                    "\nReforma judicial y lucha contra la corrupción\n" +
                    "Establecer un sistema judicial independiente del poder económico.\n" +
                    "Sancionar con rigor la corrupción tanto pública como privada.\n" +
                    "\nProtección del medio ambiente y recursos naturales\n" +
                    "Implementar una política ecológica planificada que priorice la soberanía ambiental.\n" +
                    "Prohibir la megaminería destructiva y eliminar zonas de sacrificio.\n"
            ,
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
                    "Coordinar a todas las instituciones del Estado —policías, FF.AA., Gendarmería, Aduanas, SII, ANI y Ministerio Público— para enfrentar el crimen organizado.\n" +
                    "Recuperar el control territorial con una inversión inicial de US\$2.500 millones destinada a seguridad.\n" +
                    "\nAumento de dotación policial y modernización tecnológica\n" +
                    "Incorporar 10.000 nuevos carabineros a nivel nacional.\n" +
                    "Implementar cámaras inteligentes, drones, pórticos de reconocimiento y sistemas de IA para prevenir delitos.\n" +
                    "\nRecuperar el control de las cárceles\n" +
                    "Construir cinco nuevas cárceles, incluyendo tres de alta seguridad, y aislar a líderes criminales.\n" +
                    "Expulsar a 3.000 extranjeros condenados y trasladar Gendarmería al Ministerio de Seguridad.\n" +
                    "\nBlindaje de fronteras e inmigración controlada\n" +
                    "Crear una Policía Militar Fronteriza con barreras físicas, sensores y vigilancia tecnológica.\n" +
                    "Construir dos centros de expulsión biométricos, eliminar beneficios a migrantes irregulares y sancionar a quienes los contraten.\n" +
                    "\nLucha contra la corrupción y el narcotráfico institucional\n" +
                    "Fortalecer controles internos en FF.AA., Carabineros y el Poder Judicial.\n" +
                    "Crear una Fiscalía de Asuntos Internos y una Fiscalía Supraterritorial especializada en crimen organizado.\n" +
                    "\nReforma al sistema judicial\n" +
                    "Dividir el gobierno judicial en organismos autónomos encargados de nombramientos, administración y formación.\n" +
                    "Crear una Defensoría de las Víctimas con apoyo legal, psicológico y social.\n" +
                    "\nCrecimiento económico sostenido al 4% anual\n" +
                    "Reducir el impuesto corporativo al 23% y luego al 18% en 10 años.\n" +
                    "Bajar el gasto público en US\$8.000 millones y eliminar la “permisología”, estableciendo contratos tributarios estables por 20 años.\n" +
                    "\nCreación de 1.000.000 de empleos formales\n" +
                    "Impulsar empleos de calidad con foco en mujeres, jóvenes y adultos mayores.\n" +
                    "Promover la formalización laboral y jornadas flexibles anuales o por horas.\n" +
                    "\nPolítica activa de equidad de género\n" +
                    "Implementar el programa “Mujer camina tranquila” para mayor seguridad en espacios públicos.\n" +
                    "Fortalecer la protección a víctimas de violencia, incluir brazalete de emergencia y sala cuna universal.\n" +
                    "\nReforma del sistema de salud\n" +
                    "Reducir listas de espera mediante un plan nacional que incluya telemedicina y alerta oncológica.\n" +
                    "Construir 100 nuevos CESFAMs y 30 hospitales, además de habilitar mamógrafos móviles.\n" +
                    "\nPlan Nacional de Vivienda\n" +
                    "Construir 400.000 viviendas nuevas y mejorar otras 400.000.\n" +
                    "Priorizar terrenos públicos y desarrollar barrios integrados con servicios y transporte.\n" +
                    "\nEducación con foco en calidad y libertad de elección\n" +
                    "Recuperar aprendizajes perdidos tras la pandemia y reducir la burocracia escolar.\n" +
                    "Fortalecer la educación técnico-profesional y asegurar el derecho de las familias a elegir.\n" +
                    "\nPacto de desarrollo productivo\n" +
                    "Impulsar sectores estratégicos como minería, energía, agricultura, forestal, turismo y tecnología.\n" +
                    "Modernizar la Dirección General de Aguas y ejecutar un Plan Nacional de Desalación y Embalses.\n" +
                    "\nEstrategia Nacional de Ciencia, Tecnología e Innovación\n" +
                    "Fomentar investigación aplicada, digitalización e inteligencia artificial.\n" +
                    "Establecer un Compromiso Espacial Nacional con satélites de observación y comunicaciones.\n" +
                    "\nPolítica de defensa moderna y autónoma\n" +
                    "Reforzar capacidades estratégicas y modernizar el servicio militar.\n" +
                    "Desarrollar la industria de defensa nacional mediante FAMAE, ASMAR y ENAER.\n" +
                    "\nEstado eficiente y sin corrupción\n" +
                    "Implementar auditorías, digitalizar trámites y fortalecer la meritocracia en el servicio público.\n" +
                    "Eliminar programas ineficaces y potenciar la labor de la Contraloría para mayor control y transparencia.\n"
            ,
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
                "Comité Nacional de Seguridad\n" +
                        "Crear un comité permanente para coordinar estrategias de seguridad entre Carabineros, PDI, Ministerio Público y otras instituciones.\n" +
                        "Fortalecer el Ministerio de Seguridad para dotarlo de más atribuciones operativas y de mando.\n" +
                        "\nUso de Fuerzas Armadas en zonas críticas\n" +
                        "Desplegar las Fuerzas Armadas en la frontera norte y en La Araucanía “hasta que la situación se normalice”.\n" +
                        "Aplicar la Ley de Infraestructura Crítica en operaciones relevantes para enfrentar crimen organizado.\n" +
                        "\nTransformación del sistema de salud\n" +
                        "Reducir las listas de espera en la atención médica.\n" +
                        "Crear “Centros Comunitarios de Salud Mental” para expandir la atención psicológica a nivel local.\n" +
                        "\nVivienda digna y financiamiento social\n" +
                        "Usar recursos de AFP y aseguradoras para financiar hipotecas de bajo costo para vivienda social.\n" +
                        "Diseñar nuevos modelos habitacionales para erradicar campamentos y promover barrios integrados.\n" +
                        "\nEducación basada en tecnología y ética\n" +
                        "Crear un “Marco Nacional de Uso Ético de Inteligencia Artificial” para su incorporación en las aulas.\n" +
                        "Establecer el Instituto Nacional para la Mejora Educativa (INME) para auditar y proponer estándares pedagógicos.\n" +
                        "\nDesarrollo sustentable y medioambiente\n" +
                        "Promover el desarrollo de “ciudades esponja” que absorban y reutilicen agua de lluvia mediante urbanismo verde\n" +
                        "Impulsar una transición energética con fuerte inversión en energía solar, eólica, geotérmica y almacenamiento, y cierre paulatino de centrales a carbón.\n" +
                        "\nProtección oceánica\n" +
                        "Desarrollar una Propuesta Oceánica para proteger los ecosistemas marinos frente a la contaminación y sobrepesca.\n" +
                        "Fomentar el uso sostenible de los océanos como fuente de empleo y alimento, integrando la conservación ambiental con la economía.\n" +
                        "\nJusticia, transparencia e igualdad ante la ley\n" +
                        "Garantizar que todos los ciudadanos tengan igual dignidad y trato ante la ley, sin privilegios ni amiguismos.\n" +
                        "Reformar la Alta Dirección Pública para fortalecer la meritocracia y reducir la politización de cargos públicos.\n" +
                        "\nMejora del Ministerio Público\n" +
                        "Rediseñar los indicadores de gestión del Ministerio Público para priorizar delitos de alto impacto y calidad en la investigación\n" +
                        "Incluir métricas de satisfacción de víctimas y complejidad de causas para una justicia más efectiva.\n" +
                        "\nEconomía, competitividad y empleo\n" +
                        "Crear una “ventanilla única digital nacional” para agilizar proyectos de inversión y dar trazabilidad pública\n" +
                        "Generar Centros de Competitividad Territorial (CCT) en universidades públicas regionales para apoyar el desarrollo regional\n" +
                        "\nEquidad y valores democráticos\n" +
                        "Recuperar “mesura, cordura, templanza y tolerancia” en la política como ejes de su gobierno.\n" +
                        "Afirmar una posición de independencia política, sin compromisos con partidos ni elites, para garantizar que su obligación sea con la ciudadanía.\n"
            ,
            partidoPolitico = "Independiente",
            foto = R.drawable.maynenicholls
        )
    )
}