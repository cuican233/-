package com.cc.zuoye.zuoye3.question2;

/**
 * @author CC
 * @date 2023/5/22
 */
public class State {
    public static void main(String[] args) {
        Context tcp = new Context();
        tcp.changeTCPState(new EstablishedTCP());
        tcp.doWork();

        tcp.changeTCPState(new ListeningTCP());
        tcp.doWork();
    }
}

abstract class tcpState{
    abstract void doWork();
}
class EstablishedTCP extends tcpState{

    @Override
    public void doWork() {
        System.out.println("建立状态的TCP");
    }
}
class ListeningTCP extends tcpState{

    @Override
    public void doWork() {
        System.out.println("监听状态的TCP");
    }
}
class ClosedTCP extends tcpState{

    @Override
    public void doWork() {
        System.out.println("关闭状态的TCP");
    }
}

class Context{
    private tcpState tcpState;
    public void changeTCPState(tcpState tcpState){
        this.tcpState = tcpState;
    }
    public void doWork(){
        tcpState.doWork();
    }
}