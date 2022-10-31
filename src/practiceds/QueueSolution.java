/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceds;


/**
 *
 * @author dixit
 */
class QueueUsingArrays {

    int frontQ, rearQ;
    int capacityOfQ;
    static int[] q1;

    QueueUsingArrays(int size) {
        capacityOfQ = size;
        q1 = new int[capacityOfQ];
    }

    void enqueue(int value) {
        if (rearQ == capacityOfQ) {
            System.out.println("Queue is full");
        } else {
            q1[rearQ] = value;
            rearQ++;
        }
    }

    void dequeue() {
        if (rearQ == 0) {
            System.out.println("Queue is empty.");
            return;
        } else {
            for (int i = 0; i < rearQ - 1; i++) {
                q1[i] = q1[i + 1];
            }
            rearQ--;
        }

    }

    void display() {
        if (rearQ == 0) {
            System.out.println("Queue is empty.");
        } else {
            for (int i = 0; i < rearQ; i++) {
                System.out.print(q1[i] + " <- ");
            }
            System.out.println("");

        }
    }

}

public class QueueSolution {

    public static void main(String[] args) {
        QueueUsingArrays q2 = new QueueUsingArrays(5);
        q2.enqueue(1);
        q2.enqueue(3);
        q2.enqueue(8);
        q2.enqueue(10);

        q2.display();

        q2.dequeue();
        q2.display();

    }
}
