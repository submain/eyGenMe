

 class ASsImpl implements ASs {
    static {
        System.out.println("今天带代码加快");
    }


    public static void main(String[] args) {
        ASs.sss();
        ASsImpl aSs = new ASsImpl();
        aSs.sa();
        new ASs(){
            @Override
            public void sa() {

            }
        };

    }

     static class inner{
         static void  fda(){

        }
    }
}
