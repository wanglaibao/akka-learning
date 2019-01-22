package com.laibao.akka

import akka.actor.{ActorSystem, Props}
import com.laibao.akka.actor.HelloActor

object AkkaMain {

  def main(args: Array[String]): Unit = {
    val system = ActorSystem("HelloSystem")

    // 缺省的Actor构造函数
    val helloActor = system.actorOf(Props[HelloActor], name = "helloActor")
    helloActor ! "hello"
    helloActor ! "喂"
  }
}
