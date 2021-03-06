/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Dialvec
 */
public interface BikeShopParameters {
    //Database Connection
    public final String DB_CRED_PATH = "/src/utils/db_credentials.json";
    public final String PW_PATH = "/src/utils/pswrd.json";
    public final String SCHEMA = "BikeShop";
    
    //Mensajes de uso general
     public final String TITULO_CAMPO_VACIO = "Campos obligatorios";
     public final String TITULO_CAMPO_REPETIDO = "Campos Repetido en DB";
     public final String OP_OK = "Operación exitosa";
     public final String BUSQUEDA_VACIA = "La búsqueda no produjo resultados";
     public final String DEBUG = "System Debug";
    
    //ModelNames para MainWindow
    public final String MODEL_CLIENTE = "ModelCliente";
    public final String MODEL_BICICLETA = "ModelBicicleta";
    public final String MODEL_MOTO = "ModelMoto";
    public final String MODEL_PROVEEDOR = "ModelProveedor";
    public final String MODEL_INTENCION = "ModelIntencion";
    
    
    //Modos de ventana
    public final String EDIT_MODE = "EditMode";
    public final String CREATE_MODE = "CreateMode";
    public final String SEARCH_MODE = "SearchMode";
    public final String DELETE_MODE = "DeleteMode";
    
    
    //Botones Ventanas múltiples
    public final String BOTON_CREAR = "Crear";
    public final String BOTON_BUSCAR = "Buscar";
    public final String BOTON_GUARDAR_CAMBIOS = "Guardar Cambios";
    //Botones MainWindow
    public final String BOTON_BORRAR = "Borrar Selección";
    public final String BOTON_MODIFICAR = "Modificar";
    
    
    //Cliente
    public final String ALIAS_CLIENTE = "Alias cliente";
    public final String NOMBRE_CLIENTE = "Nombre cliente";
    public final String APELLIDO_CLIENTE = "Apellido cliente";
    public final String MAIL = "e-mail";
    public final String CONTRASENA = "Contraseña";
    public final String CELULAR = "Celular";
    public final String DOB = "Fecha nacimiento";
    public final String ALIAS_VACIO = "El campo 'Alias' no puede estar vacío";
    public final String NOMBRE_VACIO = "El campo 'Nombres' no puede estar vacío";
    public final String APELLIDO_VACIO = "El campo 'Apellidos' no puede estar vacío";
    
    //Ventana Cliente
    public final String CREAR_CLIENTE = "Crear Cliente";
    public final String BUSCAR_CLIENTE = "Buscar Cliente";
    public final String MODIF_CLIENTE = "Modificar Cliente";
    public final String ALIAS_REPETIDO = "El 'Alias' ingresado ya existe en la base de datos. Por favor seleccione uno diferente.";
    public final String CLIENTE_INSTR = "Indique información del cliente";
    public final String CLIENTE_CREADO = "Cliente creado satisfactoriamente";
    public final String CLIENTE_UPDATE = "Cliente actualizado satisfactoriamente";
    public final String CLIENTE_BORRADO = "Cliente borrado satisfactoriamente";
 
    
    //Vehículo
    public final String FABRICANTE = "fabricante vehículo";
    public final String PRECIO = "precio";
    //Bicicletas
    public final String BICICLETAS = "Bicicletas";
    public final String MOTOS = "Motos Eléctricas";
    //Motos
    public final String ANIO_FABRICACION = "año fabricación";
    public final String PROVEEDOR_MOTOR = "proveedor del motor";
    public final String AUTONOMIA = "horas autonomía";
    
    //Ventana vehículo
    public final String BUSCAR_VEHICULO_INSTR = "Indique información del vehículo";
    public final String BUSCAR_VEHICULO = "Buscar Vehículo";
    public final String MODIF_VEHICULO = "Editar Vehículo";
    public final String CREAR_VEHICULO = "Crear Vehículo";
    public final String BOTON_BUSCAR_BICI = "Buscar Bicicleta";
    public final String BOTON_BUSCAR_MOTO = "Buscar Motocicleta";
    public final String BOTON_MODIF_BICI = "Modificar Bicicleta";
    public final String BOTON_MODIF_MOTO = "Modificar Motocicleta";
    public final String BOTON_CREAR_BICI = "Crear Bicicleta";
    public final String BOTON_CREAR_MOTO = "Crear Motocicleta";
    public final String EDITAR_VEHICULO_INSTR = "Indique información de vehículo";
    public final String VEHICULO_CREADO = "Vehículo creado satisfactoriamente";
    public final String VEHICULO_UPDATE = "Vehículo actualizado satisfactoriamente";
    public final String VEHICULO_BORRADO = "Vehículo borrado satisfactoriamente";
    public final String NO_MODE_VEHICLE_WINDOW = "VehicleWindow no tiene modo asignado";
    public final String FABRICANTE_VACIO = "El campo 'Fabricante' no puede estar vacío";
    public final String PROVEEDOR_VACIO = "El campo 'Proveedor' no puede estar vacío";
    public final String FABRICANTE_REPETIDO = "El 'Fabricante' ingresado ya existe en la base de datos. Por favor seleccione uno diferente.";
    
    
    //Bicicletas
    public final String BUSCAR_BICICLETA = "Buscar Bicicleta";
    public final String BICI_CREADO = "Bicicleta creada satisfactoriamente";
    public final String BICI_UPDATE = "Bicicleta actualizada satisfactoriamente";
    public final String BICI_BORRADO = "Bicicleta borrada satisfactoriamente";
    //Motos
    public final String BUSCAR_MOTO = "Buscar Moto";
    public final String MOTO_CREADO = "Motocicleta creada satisfactoriamente";
    public final String MOTO_UPDATE = "Motocicleta actualizada satisfactoriamente";
    public final String MOTO_BORRADO = "Motocicleta borrado satisfactoriamente";
    public final String MOTO_REPETIDA = "Esta motocicleta Ya exsite en la base de datos";
    
    //Ventana Intención Compra
    public final String BUSCAR_INTENCION = "Buscar Cotización";
    public final String CREAR_INTENCION = "Crear Cotización";
    public final String MODIF_INTENCION = "Modificar Cotización";
    public final String BUSCAR_INTENCION_INSTR = "Indique información de la cotización.";
    public final String FECHA = "Fecha y hora";
    public final String INTENCION_CREADO = "Cotización creada satisfactoriamente";
    public final String INTENCION_UPDATE = "Cotización actualizada satisfactoriamente";
    public final String INTENCION_BORRADO = "Cotizacióna borrada satisfactoriamente";
    
    
    //Proveedores
    public final String PROVEEDOR_CREADO = "Proveedor de Motor actualizado satisfactoriamente";
    public final String PROVEEDOR_UPDATE = "Proveedor de Motor actualizado satisfactoriamente";
    public final String PROVEEDOR_BORRADO = "Proveedor de Motor borrado satisfactoriamente";
    
    
    //Ventana Contraseñas
    public final String WRONG_PASS_MSG = "La contrseña ingresada no es correcta";
    public final String WRONG_PASS_TITLE = "La contrseña ingresada no es correcta";
    
    
    //Ventana Principal
    public final String RBUTTON_CLIENTE = "Cliente";
    public final String RBUTTON_VEHICULO = "Vehículo";
    public final String RBUTTON_INTENCION = "Intención de Compra";
    public final String MAIN_INSTR = "Seleccione consulta";
    public final String RESULT_QUERY = "Resultado de consulta";
    
}
