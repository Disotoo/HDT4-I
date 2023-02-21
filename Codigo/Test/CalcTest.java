import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 19-02-2023
 * Clase CalcTest: Pruebas Unitarias
 */


class CalcTest {
	Calculadora calculadora = Calculadora.getInstance();
	FStack<Integer> respuesta = new FStack<>();
	Stack<Integer> sta = new Stack<>();
	FLista<Integer> tipolista = new FLista<>();


	@Test
	void pullpushVectorTest() {
		sta = respuesta.getInstance(1, 0);
		sta.push(4);
		sta.push(3);
		sta.push(2);
		int resultado = 0;
		resultado = (int) sta.pull();
		assertEquals(2, resultado);
	}

	@Test
	void pullpushArrayTest() {
		sta = respuesta.getInstance(2, 0);
		sta.push(4);
		sta.push(3);
		sta.push(2);
		int resultado = 0;
		resultado = (int) sta.pull();
		assertEquals(2, resultado);
	}

	@Test
	void pullpushSingleTest() {
		sta = respuesta.getInstance(3, 1);
		sta.push(4);
		sta.push(3);
		sta.push(2);
		int resultado = 0;
		resultado = (int) sta.pull();
		assertEquals(2, resultado);
	}

	@Test
	void pullpushDoubleTest() {
		sta = respuesta.getInstance(3, 2);
		sta.push(4);
		sta.push(3);
		sta.push(2);
		int resultado = 0;
		resultado = (int) sta.pull();
		assertEquals(2, resultado);
	}

	@Test
	void arrayTest() throws Exception{
		Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista = new ArrayList<>();
		sta = respuesta.getInstance(2,0);
		lista.add("1");
		lista.add("2");
		lista.add("+");
		lista.add("4");
		lista.add("*");
		lista.add("3");
		lista.add("+");
		int resultado = calculadora.Calculate1(lista,sta);
		assertEquals(15, resultado);
	}

	@Test
	void vectorTest() throws Exception{
		Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista = new ArrayList<>();
		sta = respuesta.getInstance(1,0);
		lista.add("1");
		lista.add("2");
		lista.add("+");
		lista.add("4");
		lista.add("*");
		lista.add("3");
		lista.add("+");
		int resultado = calculadora.Calculate1(lista,sta);
		assertEquals(15, resultado);
	}

	@Test
	void list1Test() throws Exception{
		Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista = new ArrayList<>();
		sta = respuesta.getInstance(3,1);
		lista.add("1");
		lista.add("2");
		lista.add("+");
		lista.add("4");
		lista.add("*");
		lista.add("3");
		lista.add("+");
		int resultado = calculadora.Calculate1(lista,sta);
		assertEquals(15, resultado);
	}

	@Test
	void list2Test() throws Exception{
		Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista = new ArrayList<>();
		sta = respuesta.getInstance(3,2);
		lista.add("1");
		lista.add("2");
		lista.add("+");
		lista.add("4");
		lista.add("*");
		lista.add("3");
		lista.add("+");
		int resultado = calculadora.Calculate1(lista,sta);
		assertEquals(15, resultado);
	}

}