Feature: Reserva de un viaje

  @1
  Scenario: Seleccionar hotel
    Given luego de ingresar a la pagina de travelocity
    When selecciono la opción 1
    And proceded a ingresar la información solicitada y escojo el hotel
       |fecha_inicial| fecha_final |    nombreHotel    | habitacion|Pais         |
       | May 9, 2021 |May 14, 2021 |  Panoramic Grand  |  2        | Argentina   |
    Then procedo con la reserva Your payment options

  @2
  Scenario: Seleccionar vuelo
    Given luego de ingresar a la pagina de travelocity
    When selecciono la opción 2
    And proceded a ingresar la información solicitada y escojo vuelos ida y vuelta
      |fecha_inicial| fecha_final |    origen    |destino| numero_vuelo_ida|numero_vuelo_vuelta|
      | May 9, 2021 |May 14, 2021 |  bogota  |  Argentina|       3         |          2        |
    Then se puede visualizar el siguiente mensaje
    |mensaje|
    |   Unlock trip savings up to $378* when you book a flight and hotel together|

  @3
  Scenario: Seleccionar paquete
    Given luego de ingresar a la pagina de travelocity
    When selecciono la opción 4
    And proceded a ingresar la información solicitada, escoje un paquete y lo reserva
      |fecha_inicial| fecha_final |    origen|destino| numero_vuelo_ida|numero_vuelo_vuelta|    nombreHotel|                             habitacion|
      | May 9, 2021 |May 14, 2021 |  bogota  |  Argentina|         3      | 2       |  Hotel Boutique & Spa, Opens in a new window     |           1|
    Then se puede visualizar lo siguiente Starting price

  @4
  Scenario: Seleccionar Paseos
    Given luego de ingresar a la pagina de travelocity
    When selecciono la opción 5
    And proceded a ingresar la información solicitada, escoje un plan y lo reserva
      |fecha_inicial| fecha_final |    origen |destino|    numPaseo        |              paseo                       |
      | May 9, 2021 |May 14, 2021 |  bogota  |  Argentina|         2       |  San Isidro & Tigre Small Group Tour     |
    Then se visualiza el siguiente titulo
    |mensaje|
    |      Sorry, we're unable to find things to do for your trip dates|

  @5
  Scenario: Seleccionar Cruceros
    Given luego de ingresar a la pagina de travelocity
    When selecciono la opción 6
    And proceded a ingresar la información solicitada, escoje el crucero y lo reserva
      |fecha_inicial| fecha_final |destino|    numCreucero        |              numHabitacion                       |
      | May 9, 2021 |May 14, 2021 |  Europe|         2            |       2     |
    Then se visualiza el siguiente anuncio Price details