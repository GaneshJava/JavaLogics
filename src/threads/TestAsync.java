package threads;

   
class TestAsync {

public static void main(String args[]) throws InterruptedException{
            System.out.println("Main Method start");
            longRunningMethod("testing", new Object());
            asyncServiceMethod("testing",new Object());
            otherMethod();
        }
       
        public static Integer longRunningMethod(String param1,Object parm2) throws InterruptedException{
            System.out.println("Long running method");
            Thread.sleep(5000);
            //long process
            return 1;
        }
       
        public static void otherMethod(){
            System.out.println("Other Method");
        }
       
       
        public static void asyncServiceMethod(final String parm1,final Object obj){
            Runnable task = new Runnable() {

                @Override
                public void run() {
                	System.out.println("in asys thread");
                    try {
                       longRunningMethod(parm1,obj);
                    } catch (Exception ex) {
                        //handle error which cannot be thrown back
                    }
                }
            };
            new Thread(task, "ServiceThread").start();
        }
}