import java.util.*;
import java.lang.*;
import java.io.*;
public class Prim
{
    private static final int countOfVertices = 5; 
    int findMinKey(int keys[], Boolean setOfMST[])   
    { 
        int minimum_index = -1;   
        int minimum_value = Integer.MAX_VALUE;  
        for (int vertex = 0; vertex < countOfVertices; vertex++)   
            if (setOfMST[vertex] == false && keys[vertex] < minimum_value) {   
                minimum_value = keys[vertex];   
                minimum_index = vertex;   
            }   
    
        return minimum_index;   
    }   
    void minimumSpanningTree(int mstArray[], int graphArray[][])   
    {   
        int sum = 0;
        System.out.print("MST for the given tree is:");   
        for (int j = 1; j < countOfVertices; j++) {  
            sum = sum + graphArray[j][mstArray[j]];   
        }
        System.out.print(sum);
    }   
    void designMST(int graphArray[][])   
    {   
        int mstArray[] = new int[countOfVertices];   
        int keys[] = new int[countOfVertices];   
        Boolean setOfMST[] = new Boolean[countOfVertices];   
        for (int j = 0; j < countOfVertices; j++) {   
            keys[j] = Integer.MAX_VALUE;   
            setOfMST[j] = false;   
        } 
        keys[0] = 0;    
        mstArray[0] = -1;  
        for (int i = 0; i < countOfVertices - 1; i++) {   
            int edge = findMinKey(keys, setOfMST);  
            setOfMST[edge] = true;   
            for (int vertex = 0; vertex < countOfVertices; vertex++) 
                if (graphArray[edge][vertex] != 0 && setOfMST[vertex] == false && graphArray[edge][vertex] < keys[vertex]) {   
                    mstArray[vertex] = edge;   
                    keys[vertex] = graphArray[edge][vertex];   
                }   
        }
        minimumSpanningTree(mstArray, graphArray);   
    }   
 public static void main(String[] args) {
     Prim t = new Prim();
  int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                                      { 2, 0, 3, 8, 5 },
                                      { 0, 3, 0, 0, 7 },
                                      { 6, 8, 0, 0, 9 },
                                      { 0, 5, 7, 9, 0 } };
        t.designMST(graph);
 }
}