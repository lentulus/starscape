CREATE TABLE IF NOT EXISTS `systems` (
	`system_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`primary_star_id` INT NOT NULL,
	`system_name` VARCHAR(255),
	`human_habitability` INT COMMENT 'best habitability rating in the system',
	PRIMARY KEY(`system_id`)
);


CREATE TABLE IF NOT EXISTS `stars` (
	`star_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`parent_star_id` INT,
	`star_name` VARCHAR(255),
	`component` VARCHAR(255),
	`star_class` VARCHAR(255),
	`mass` DOUBLE,
	`temp` DOUBLE,
	`diameter` DOUBLE,
	`luminosity` DOUBLE,
	`mao` DOUBLE,
	`hzco` DOUBLE,
	`orbit_paramers_id` INT,
	PRIMARY KEY(`star_id`)
);


CREATE TABLE IF NOT EXISTS `orbit_parameters` (
	`orbit_parameter_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`orbit_num` DOUBLE,
	`au` DOUBLE,
	`ecc` DOUBLE,
	`period` DOUBLE,
	PRIMARY KEY(`orbit_parameter_id`)
);


CREATE TABLE IF NOT EXISTS `body_or_belt` (
	`body_or_belt_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`orbits_star_id` INT NOT NULL,
	`orbit_parameters_id` INT,
	PRIMARY KEY(`body_or_belt_id`)
);


CREATE TABLE IF NOT EXISTS `moon_or_ring` (
	`moon_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`orbits_planet_id` INT NOT NULL,
	`orbit_parameters_id` INT,
	PRIMARY KEY(`moon_id`)
);


CREATE TABLE IF NOT EXISTS `rocky_objects` (
	`rockey_objects_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`is_body_or_belt_id` INT,
	`is_moon_id` INT,
	`is_belt_significant_body_id` INT,
	`size` INT COMMENT 'Traveller size as #
',
	`diameter` DOUBLE,
	`composit_description_id` INT,
	`density` DECIMAL,
	`gravity` DOUBLE,
	`mass` DOUBLE,
	`escape_velocty` DOUBLE,
	`hydrographics_code` INT,
	`day_length` DOUBLE,
	`resource_rating` DOUBLE,
	`habitability_rating` DOUBLE,
	PRIMARY KEY(`rockey_objects_id`)
);


CREATE TABLE IF NOT EXISTS `descriptions` (
	`descripton_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`content` VARCHAR(255) NOT NULL,
	PRIMARY KEY(`descripton_id`)
) 


CREATE TABLE IF NOT EXISTS `belts` (
	`belt_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`orbit_parameters_idid` INT,
	`is_body_or_belt_id` INT NOT NULL,
	`span` DOUBLE,
	`m_type_num` INT,
	`s_type_num` INT,
	`c_type_num` INT,
	`bels_bulk` INT,
	`belts_resource_rating` INT,
	PRIMARY KEY(`belt_id`)
);


CREATE TABLE IF NOT EXISTS `belt_signficant_bodies` (
	`signficant_body_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`belt_id` INT,
	`orbit_parameters_id` INT,
	`rocky_object_id` INT,
	PRIMARY KEY(`signficant_body_id`)
);


CREATE TABLE IF NOT EXISTS `rings` (
	`ring_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`moon_id` INT,
	`ring_centre_location` DOUBLE,
	`ring_span` DOUBLE,
	PRIMARY KEY(`ring_id`)
);


CREATE TABLE IF NOT EXISTS `atmospheres` (
	`atmosphere_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`atmosphere_code` INT,
	`armosphere_description_id` INT,
	`atmosphere_pressure` DOUBLE,
	`oxygen_fraction` DOUBLE,
	`scale_height` DOUBLE,
	`rocky_object_id` INT,
	PRIMARY KEY(`atmosphere_id`)
);


CREATE TABLE IF NOT EXISTS `taints` (
	`taint_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`atmosphere_id` INT,
	`taint_subtype_id` INT,
	`taint_severity_id` INT,
	`taint_persistance_id` INT,
	PRIMARY KEY(`taint_id`)
);


CREATE TABLE IF NOT EXISTS `taint_subtypes` (
	`taint_subtype_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`taint_description` VARCHAR(255) NOT NULL,
	`type_code` CHAR(1) NOT NULL UNIQUE,
	PRIMARY KEY(`taint_subtype_id`)
);


CREATE TABLE IF NOT EXISTS `taint_severities` (
	`taint_severity_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`taint_severity_code` CHAR(1),
	`taints_severity_description` VARCHAR(255),
	`taint_remediation_description` VARCHAR(255),
	PRIMARY KEY(`taint_severity_id`)
);


CREATE TABLE IF NOT EXISTS `taint_pesistances` (
	`taint_persistance_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`taint_persistance_code` CHAR(1),
	`persistance_description` VARCHAR(255),
	PRIMARY KEY(`taint_persistance_id`)
);


CREATE TABLE IF NOT EXISTS `exotic_atmospheres` (
	`exotic_atmospheres_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`atmosphere_id` INT,
	`exotic_atmosphere_subtypes_id` INT,
	PRIMARY KEY(`exotic_atmospheres_id`)
);


CREATE TABLE IF NOT EXISTS `exotic_atmosphere_subtypes` (
	`exotic_atmosphere_subtype_id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`exotic_atmosphere_subtype_code` CHAR(1),
	`description` VARCHAR(255),
	PRIMARY KEY(`exotic_atmosphere_subtype_id`)
);

