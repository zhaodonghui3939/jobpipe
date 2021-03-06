package org.deephacks.jobpipe;

class Debug {

  static void debug(String msg, boolean verbose) {
    if (verbose) {
      System.out.println(msg);
    }
  }

  static void debug(Throwable e, boolean verbose) {
    if (verbose) {
      e.printStackTrace(System.err);
    }
  }
}
