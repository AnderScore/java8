https://github.com/winterbe/java8-tutorial

http://winterbe.com/posts/2015/04/07/java8-concurrency-tutorial-thread-executor-examples/

http://www.nurkiewicz.com/2013/05/java-8-definitive-guide-to.html
ComposableFuture
 + *      .begin(Future.succeededFuture("Beginning"))
 + *      .thenApply(s -> s + " middle")
 + *      .end(asyncResult -> {
 + *          assert "Beginning middle".equals(asyncResult.result()) ;
 + *      });