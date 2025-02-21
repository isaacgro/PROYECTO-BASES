drop database if exists hospitalBDA;
Create database if not exists hospitalBDA;
use hospitalBDA;

create table if not exists usuarios (
	id_Usuario int primary key auto_increment,
    contra varchar (30) not null
);

create table if not exists pacientes (
	id_Paciente int primary key auto_increment,
    fecha_nacimiento date not null,
    nombre varchar (25) not null,
    apellidoP varchar (25) not null,
    apellidoM varchar (25) null,
    edad int not null,
    telefono varchar (10) not null,
    correoE varchar (50) unique,
    id_Usuario int,
    foreign key (id_Usuario) references usuarios (id_Usuario)
);

create table if not exists direccion_pacientes (
	id_Direccion int primary key auto_increment,
    calle varchar (30) not null,
    numExt varchar (5) not null,
    colonia varchar (25) not null,
    id_Paciente int,
    foreign key (id_Paciente) references pacientes(id_Paciente)
);

create table if not exists consultas (
	id_Consulta int primary key auto_increment,
    fecha_hora datetime not null,
    tratamiento varchar(30) not null,
    diagnostico varchar (30) not null
);

create table if not exists horarios (
	id_Horario int primary key auto_increment,
    fecha date not null,
    hora_inicio time not null,
    hora_fin time not null,
    id_Consulta int,
    foreign key (id_Consulta) references consultas (id_Consulta)
);

create table if not exists medicos (
	id_Medico int primary key auto_increment,
    nombre varchar (25) not null,
    apellidoP varchar (25) not null,
    apellidoM varchar (25) null,
    cedulaPro varchar(25) unique,
    especialidad varchar (30) not null,
    id_Horario int,
    id_Usuario int,
    foreign key (id_Horario) references horarios(id_Horario), 
    foreign key (id_Usuario) references usuarios(id_Usuario)
);



create table if not exists citas (
	id_Cita int primary key auto_increment,
    estado enum ('pendiente','cancelado'),
    fecha_hora datetime not null,
    id_Paciente int,
    id_Medico int,
    foreign key (id_Paciente) references pacientes (id_Paciente),
    foreign key (id_Medico) references medicos (id_Medico)
);

create table if not exists citasR (
	id_CitaR int primary key auto_increment,
    id_Cita int,
    foreign key (id_Cita) references citas (id_Cita)
);

create table if not exists citasE (
	id_CitaE int primary key auto_increment,
    folio varchar (15) null,
    id_Cita int,
    foreign key (id_Cita) references citas (id_Cita)
);

create table if not exists horarios_consultas (
	id_horarioConsulta int primary key auto_increment,
    hora_inicio time not null,
    hora_fin time not null,
    id_Horario int,
    id_Consulta int,
    foreign key (id_Horario) references horarios (id_Horario),
    foreign key (id_Consulta) references consultas (id_Consulta)
);

DELIMITER //

create procedure generaFolio (out folioG varchar(15))
Begin
    declare folio_existente int default 1;
    
    while folio_existente > 0 do
        set folioG = 
            CONCAT(
                LPAD(CONV(FLOOR(RAND() * 36), 10, 36), 5, '0'),
                LPAD(CONV(FLOOR(RAND() * 36), 10, 36), 5, '0'),
                LPAD(CONV(FLOOR(RAND() * 36), 10, 36), 5, '0')
            );
            
        select count(*) into folio_existente 
        from citasE 
        where folio = folioG;
    end while;
End//

DELIMITER ;

Delimiter //

create trigger folioAuto 
before insert on citasE
for each row
Begin
	Declare folioN varchar (15);

	call generaFolio(folioN);
    
    set new.folio = folioN;
End//

Delimiter ;

-- Insertar usuarios
insert into usuarios (contra) values
('clave123'),
('secreto456'),
('pass789'),
('claveABC');

-- Insertar pacientes
insert into pacientes (nombre, apellidoP, fecha_nacimiento, edad, telefono, correoE, id_Usuario) values
('Juan','perez','1985-06-15', 38, '6621234567', 'juan.perez@gmail.com', 1),
('Ricardo','Tapia','1990-04-22', 33, '6622345678', 'maria.lopez@gmail.com', 2),
('Jose','Agilar','1978-11-30', 45, '6623456789', 'carlos.martinez@gmail.com', 3),
('Janeth','Galvan','2000-01-10', 25, '6624567890', 'sofia.gomez@gmail.com', 4);

-- Insertar direcciones de pacientes
insert into direccion_pacientes (calle, numExt, colonia, id_Paciente) values
('Av. Reforma', '123', 'Centro', 1),
('Calle Juárez', '456', 'Norte', 2),
('Blvd. Hidalgo', '789', 'Sur', 3),
('Calle 5', '10', 'Poniente', 4);

-- Insertar consultas
insert into consultas (fecha_hora, tratamiento, diagnostico) values
('2025-02-20 10:00:00', 'Paracetamol', 'Gripe'),
('2025-02-21 11:30:00', 'Ibuprofeno', 'Dolor muscular'),
('2025-02-22 12:15:00', 'Amoxicilina', 'Infección viral'),
('2025-02-23 14:00:00', 'Antiinflamatorios', 'Dolor articular');

-- Insertar horarios
insert into horarios (fecha, hora_inicio, hora_fin, id_Consulta) values
('2025-02-20', '10:00:00', '06:00:00', 1),
('2025-02-21', '11:30:00', '07:30:00', 2),
('2025-02-22', '12:15:00', '08:00:00', 3),
('2025-02-23', '14:00:00', '08:30:00', 4);

-- Insertar médicos
insert into medicos (nombre, apellidoP, apellidoM, cedulaPro, especialidad, id_Horario, id_Usuario) values
('Juan', 'Pérez', 'Gómez', 'MED123456', 'General', 1, 1),
('María', 'López', 'Hernández', 'MED654321', 'Ortopedia', 2, 2),
('Carlos', 'Martínez', 'Díaz', 'MED789456', 'Pediatría', 3, 3),
('Ana', 'Gutiérrez', 'Sánchez', 'MED987654', 'Cardiología', 4, 4);

-- Insertar citas
insert into citas (estado, fecha_hora, id_Paciente, id_Medico) values
('pendiente', '2025-02-20 10:00:00', 1, 1),
('pendiente', '2025-02-21 11:30:00', 2, 2),
('pendiente', '2025-02-22 12:15:00', 3, 3),
('pendiente', '2025-02-23 14:00:00', 4, 4);

-- Insertar citasR
insert into citasR (id_Cita) values
(1),
(2),
(3),
(4);

-- Insertar citasE
insert into citasE (id_Cita) values
(1),
(2),
(3),
(4);

-- Insertar horarios de consultas
insert into horarios_consultas (hora_inicio, hora_fin, id_Horario, id_Consulta) values
('10:00:00', '10:30:00', 1, 1),
('11:30:00', '12:00:00', 2, 2),
('12:15:00', '12:45:00', 3, 3),
('14:00:00', '14:30:00', 4, 4);




