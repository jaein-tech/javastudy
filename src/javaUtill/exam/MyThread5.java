package javaUtill.exam;

// Thread는 실행되었다가 멈췄다가 하는것을 반복하는데 이것이 빠르게 일어나다 보니 Thread가 모두 동시에 동작하는것처럼 보이는 것이다.

// New Thread로 Thread를 생성하고 start() method로 실행하게 되면 Thread가 실행되게 된다.
// Runnable - 실행가능한 상태의 Thread
// Running - 실행중인 상태의 Thread
// Thread는 실행되면 Runnable과 Running을 왔다갔다 하게 된다.

// Thread안에서 sleep() method나 Object가 가지고 있는 wait() method가 호출이되면 Thread가 Blocked상태가 된다.

// sleep() method는 특정시간이 지나면 자기 스스로 Blocked상태에서 빠져나와 Runnable이나 Running상태가 된다.
// wait() method는 다른 Thread가 notify() method를 호출하기 전에는 Blocked상태에서 나올 수 없다.
// 또한 wait() method가 호출이 되면 Monitoring Lock(객체의 사용권)을 놓게 되기때문에 대기중인 다른 method가 실행되게 된다.


// Thread의 run() method가 종료되게 되면 Thread는 종료, Dead상태가 된다.

// yield() method가 호출되게되면 해당 Thread는 다른 Thread에게 자원을 양보하게 된다.
// 즉, 다른 Thread가 좀더 빠르게 실행되게 할 수 있다.

public class MyThread5 extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("MyThread5 : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
