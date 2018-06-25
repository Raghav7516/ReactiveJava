package com.sample;

import java.util.Arrays;
import java.util.List;

import rx.Observable;
import rx.Subscriber;

public class Test {

	public static void main(String[] args) {
		new Test().observableDemo();
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
		List<String> names=Arrays.asList("pawan","mohan","suresh","mukesh");
		Observable.from(names).filter(name->name.startsWith("m")).subscribe(myObserver);
		/*Observable.just("pawan","vijay","dinesh","mahesh").subscribe( myObserver);*/
	}
}