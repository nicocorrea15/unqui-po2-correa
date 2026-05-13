import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import po2.tp3.EquipoDeTrabajo;
import po2.tp3.Persona;

class EquipoTrabajoTest {

	Persona nico, mili, bauti, gonzi, monica;
	LocalDate fecnac, fecnac1, fecnac2,fecnac3,fecnac4;
	
	EquipoDeTrabajo equipo;
	ArrayList<Persona> integrantes;
	
	@BeforeEach
	void setUp() { 
		
		fecnac = LocalDate.of(1997, 9, 3);
		fecnac1 = LocalDate.of(2002, 1, 26);
		fecnac2 = LocalDate.of(2011, 8, 15);
		fecnac3 = LocalDate.of(1994, 8, 17);
		fecnac4 = LocalDate.of(1971, 2, 21);
		
		integrantes = new ArrayList<Persona>();
		
		nico = new Persona("Nico", fecnac);
		mili = new Persona("Mili", fecnac1);
		bauti = new Persona("Bauti", fecnac2);
		gonzi = new Persona("Gonzi", fecnac3);
		monica = new Persona("Monica", fecnac4);
		
		equipo = new EquipoDeTrabajo("distri8", integrantes);
		
		integrantes.add(nico);
		integrantes.add(mili);
		integrantes.add(bauti);
		integrantes.add(gonzi);
		integrantes.add(monica);
	}
	
	@Test
	void promedioEdades() {
		
		assertEquals(equipo.promedioEdad(),30);
		assertEquals(equipo.getNombre(), "distri8");
		
		assertEquals(mili.getEdad(),24);
		assertEquals(gonzi.getEdad(),31);
		assertEquals(bauti.getEdad(),14);
		assertEquals(monica.getEdad(),55);
		assertEquals(nico.getEdad(),28);
		
		
	}

}
