package com.qualizeal.javaapp01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Stream;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTest {
	static Class<?> operationClass;
	static Method operationMethod;
	static int counterforTest3, counterforTest4, counterforTest5;
	static int counter2forTest3, counter3forTest3, counter4forTest3;
	static int counter2forTest4, counter3forTest4, counter4forTest4;
	static int counter2forTest5, counter3forTest5, counter4forTest5;

	@Test
	@Order(1)
	public void test1() {
		boolean isValidPackageAndClassName = true;
				
		try {
			operationClass = Class.forName("com.qualizeal.javaapp01.operation.TwoNonDecimalNumbersSum");
		} catch (ClassNotFoundException cnfEx) {
			isValidPackageAndClassName = false;
		} catch (NoClassDefFoundError ncdfErr) {
			isValidPackageAndClassName = false;
		}
		
		assertTrue(isValidPackageAndClassName, "Either the package name or class name does not match with the guideline.");
	}

	boolean customConditionForClass() {
		return (operationClass == null) ? true : false;
	}

	@Test
	@Order(2)
	@DisabledIf("customConditionForClass")
	public void test2() {
		boolean isValidMethod = true;
		
		try {
			operationMethod = operationClass.getMethod("add", Integer.TYPE, Integer.TYPE);
			
			String expectedMethodSyntax = "public long com.qualizeal.javaapp01.operation.TwoNonDecimalNumbersSum.add(int,int)";
			String actualMethodSyntax = operationMethod.toString();
			
			if (!actualMethodSyntax.equals(expectedMethodSyntax)) {
				isValidMethod = false;
			}
		} catch (NoSuchMethodException nsmEx) {
			isValidMethod = false;
		}
		
		assertTrue(isValidMethod, "The method name or syntax does not match with the guideline.");
	}

	boolean customConditionForMethod() {
		return (operationMethod == null) ? true : false;
	}

	static Stream<Arguments> numbersProviderForTest3() {
		return Stream.of(
					Arguments.of(10, 2),
					Arguments.of(2, 10)
				);
	}

	@ParameterizedTest
	@MethodSource({"numbersProviderForTest3"})
	@Order(3)
	@DisabledIf("customConditionForMethod")
	public void test3(int num1, int num2) {
		int[] sampleInputs = {1, 2};
		int[] parameters1 = {10, 2};
		int[] parameters2 = {2, 10};
		long[] expectedResults = {12, 12};
		
		try {
			Object classObject = operationClass.getDeclaredConstructor((Class<?>[]) new Class[0]).newInstance(new Object[0]);
			
			long actualResult = (long) operationMethod.invoke(classObject, num1, num2);
			
			assertEquals(expectedResults[counterforTest3++], actualResult, "The result generated by the method does not match with the Expected Output of Sample Input " + sampleInputs[counter2forTest3++] + ": " + parameters1[counter3forTest3++] + " and " + parameters2[counter4forTest3++]);
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
		}
	}

	static Stream<Arguments> numbersProviderForTest4() {
		return Stream.of(
					Arguments.of(10, -2),
					Arguments.of(-10, 2),
					Arguments.of(-10, -2)
				);
	}

	@ParameterizedTest
	@MethodSource({"numbersProviderForTest4"})
	@Order(4)
	@DisabledIf("customConditionForMethod")
	public void test4(int num1, int num2) {
		int[] sampleInputs = {3, 4, 5};
		int[] parameters1 = {10, -10, -10};
		int[] parameters2 = {-2, 2, -2};
		long[] expectedResults = {-1, -1, -1};
		
		try {
			Object classObject = operationClass.getDeclaredConstructor((Class<?>[]) new Class[0]).newInstance(new Object[0]);
			
			long actualResult = (long) operationMethod.invoke(classObject, num1, num2);
			
			assertEquals(expectedResults[counterforTest4++], actualResult, "The result generated by the method does not match with the Expected Output of Sample Input " + sampleInputs[counter2forTest4++] + ": " + parameters1[counter3forTest4++] + " and " + parameters2[counter4forTest4++]);
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
		}
	}

	static Stream<Arguments> numbersProviderForTest5() {
		return Stream.of(
				Arguments.of(10, 0),
				Arguments.of(0, 2),
				Arguments.of(0, 0)
			);
	}

	@ParameterizedTest
	@MethodSource({"numbersProviderForTest5"})
	@Order(5)
	@DisabledIf("customConditionForMethod")
	public void test5(int num1, int num2) {
		int[] sampleInputs = {6, 7, 8};
		int[] parameters1 = {10, 0, 0};
		int[] parameters2 = {0, 2, 0};
		long[] expectedResults = {-2, -2, -2};
		
		try {
			Object classObject = operationClass.getDeclaredConstructor((Class<?>[]) new Class[0]).newInstance(new Object[0]);
			
			long actualResult = (long) operationMethod.invoke(classObject, num1, num2);
			
			assertEquals(expectedResults[counterforTest5++], actualResult, "The result generated by the method does not match with the Expected Output of Sample Input " + sampleInputs[counter2forTest5++] + ": " + parameters1[counter3forTest5++] + " and " + parameters2[counter4forTest5++]);
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
		}
	}
}