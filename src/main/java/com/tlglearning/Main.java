package com.tlglearning;

public class Main {

  public static void main(String[] args) {
    try(Resource res = new Resource()){
      System.out.println("start trying");
      res.process();
      System.out.println("stop trying");
    } catch(RuntimeException e){
      System.out.println("Caught RuntimeException");
    }catch (Exception e) {
      System.out.println("Caught Exception");
      throw new RuntimeException(e);
    }finally{
      System.out.println("finally");
    }
  }

}
