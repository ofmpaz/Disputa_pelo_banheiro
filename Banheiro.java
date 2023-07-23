package br.com.alura.banheiro;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banheiro {

	private Lock lock = new ReentrantLock();

	public void fazNumero1() {
		lock.lock();
		System.out.println("entrando no banheiro");
		System.out.println("fazendo coisa rapida");

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("dando descarga");
		System.out.println("lavando a mao");
		System.out.println("saindo do banheiro");
		lock.unlock();
	}

	public void fazNumero2() {
		lock.lock();

		System.out.println("entrando no banheiro");
		System.out.println("fazendo coisa demorada");

		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("dando descarga");
		System.out.println("lavando a mao");
		System.out.println("saindo do banheiro");

		lock.unlock();
	}

	public void fazNumero3() {
		lock.lock();
		System.out.println("Batendo na porta");
		System.out.println("Entrando no banheiro");
		System.out.println("Fazendo coisa muito demorada");
		try {
			Thread.sleep(35000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Dando descarga");
		System.out.println("Lavando as mãos");
		System.out.println("Saindo do banheiro");
		lock.unlock();
	}

	public void fazNumero4() {
		lock.lock();
		System.out.println("Batendo na porta");
		System.out.println("Entrando no banheiro");
		System.out.println("Lavando o cabelo");
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Dando descarga");
		System.out.println("Lavando as mãos");
		System.out.println("Saindo do banheiro");
		lock.unlock();


	}
}
