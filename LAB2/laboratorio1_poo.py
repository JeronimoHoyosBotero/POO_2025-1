# /**
#  *  Laboratorio 2 POO python
#  *  Por: Jerónimo Hoyos Botero
# */
class Fecha:
    def __init__(self,dd,mm,aa):
        self.dd = dd
        self.mm = mm
        self.aa = aa

    def fecha(self,dd,mm,aa):
        self.dd = dd
        self.mm = mm
        self.aa = aa

    def setDia(self,dd):
        self.dd = dd

    def setMes(self,mm):
        self.mm = mm

    def setA(self):
        return self.aa 
    
    def getDia(self):
        return self.dd 
    
    def getMes(self):
        return self.mm 
    
    def getA(self):
        return self.aa 
        
    def __str__(self):
        return f"{self.dd }-{self.mm }-{self.aa }"
    
class Usuario:
    def __init__(self,nombre,id,fecha_nacimiento,ciudad_nacimiento,tel,email,dir):
        self.nombre = nombre
        self.id = id
        self.fecha_nacimiento = fecha_nacimiento
        self.ciudad_nacimiento = ciudad_nacimiento
        self.tel = tel
        self.email = email
        self.dir = dir
        
    def usuario(self,nombre,id):
        self.nombre = nombre
        self.id = id

    def setNombre(self,nombre):
        self.nombre = nombre
        
    def setId(self,id):
        self.id = id

    def setFecha_nacimiento(self,fecha_nacimiento):
        self.fecha_nacimiento = fecha_nacimiento

    def setCiudad_nacimiento(self,ciudad_nacimiento):
        self.ciudad_nacimiento = ciudad_nacimiento

    def setTel(self,tel):
        self.tel = tel

    def setEmail(self,email):
        self.email = email

    def setDir(self,dir):
        self.dir = dir

    def getNombre(self):
        return self.nombre 
    
    def getId(self):
        return self.id 
    
    def getFecha_nacimiento(self):
        return self.fecha_nacimiento 
    
    def getCiudad_nacimiento(self):
        return self.ciudad_nacimiento 
    
    def getTel(self):
        return self.tel 
    
    def getEmail(self):
        return self.email
    
    def getDir(self):
        return self.dir
    
    def __str__(self):
        return f"{self.nombre },{self.id },{self.fecha_nacimiento },{self.ciudad_nacimiento },{self.tel},{self.email},{self.dir}"
    
class Direccion:
    def __init__(self,calle,nomenclatura,barrio,ciudad,edificio,apto):
        self.calle = calle
        self.nomenclatura = nomenclatura
        self.barrio = barrio
        self.ciudad = ciudad
        self.edificio = edificio
        self.apto = apto

    def setCalle(self,calle):
        self.calle = calle

    def setNomenclatura(self,nomenclatura):
        self.nomenclatura = nomenclatura

    def setBarrio(self,barrio):
        self.barrio = barrio
        
    def setCiudad(self,ciudad):
        self.ciudad = ciudad

    def setEdificio(self,edificio):
        self.edificio = edificio

    def setApto(self,apto):
        self.apto = apto

    def getCalle(self):
        return self.calle

    def getNomenclatura(self):
        return self.nomenclatura

    def getBarrio(self):
        return self.barrio

    def getCiudad(self):
        return self.ciudad

    def getEdificio(self):
        return self.edificio

    def getApto(self):
        return self.apto
    
    def __str__(self):
        return f"{self.calle },{self.nomenclatura },{self.barrio },{self.ciudad },{self.edificio},{self.apto}"

print("Parte A")
objeto_fecha = Fecha(15,5,15)
print(objeto_fecha.__str__())
objeto_direccion = Direccion("Calle 50","#20-15","El Poblado","Medellín","Altos del Sur","405")
print(objeto_direccion.__str__())
objeto_usuario = Usuario("Laura Martínez",987654321,"15-5-2005","Cali",3119876543,"laura.martinez@correo.com","Calle 50,#20-15,El Poblado,Medellín,Altos del Sur,405")
print(objeto_usuario.__str__())

print("Parte B")
print("Creacion usuario")
print("Ingrese los datos de forma correcta")
input_nombre = input("Nombre: ")
input_id = int(input("ID: "))
input_fecha_nacimiento = input("Fecha de nacimiento (dd-mm-aa): ")
input_ciudad_nacimiento = input("Ciudad de nacimiento: ")
input_tel = int(input("Teléfono: "))
input_email = input("Correo electrónico: ")
input_direccion = input("Direccion (calle,nomenclatura,barrio,ciudad,edificio,apto): ")

input_objeto_usuario = Usuario(input_nombre,input_id,input_fecha_nacimiento,input_ciudad_nacimiento,input_tel,input_email,input_direccion)
split_fecha = input_fecha_nacimiento.split("-")
input_objeto_fecha = Fecha(split_fecha[0],split_fecha[1],split_fecha[2])
split_direccion = input_direccion.split(",")
input_objeto_direccion = Direccion(split_direccion[0],split_direccion[1],split_direccion[2],split_direccion[3],split_direccion[4],split_direccion[5])
print("Atributos Usuario")
print(input_objeto_usuario.__str__())
print("Atributos Fecha")
print(input_objeto_fecha.__str__())
print("Atributos dirección")
print(input_objeto_direccion.__str__())