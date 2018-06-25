package com.sample;

import rx.Observable;
import rx.Subscriber;

public class Sample {
	public static void main(String[] args) {
		new Sample().observableDemo();
	}
	public void observableDemo() {
		
		Subscriber<String> myObserver=new Subscriber<String>() {

			@Override
			public void onCompleted() {
				System.out.println("complete");
			}

			@Override
			public void onError(Throwable arg0) {
				System.err.println(arg0);
			}

			@Override
			public void onNext(String s) {
				System.out.println("onNext");
				System.out.println(s);
			}

		};
		Observable.just("mukesh").filter(name->name.startsWith("m")).subscribe(myObserver);
	}

}
