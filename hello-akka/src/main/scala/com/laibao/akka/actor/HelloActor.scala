package com.laibao.akka.actor

import akka.actor.Actor

class HelloActor extends Actor{

  override def receive: Receive = {

    case "hello" => println("您好！")

    case _       => println("您是?")
  }
}
