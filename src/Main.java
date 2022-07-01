/*
Existem N servidores numerados de 0 a N-1 conectados por conexões ponto-a-ponto formando uma rede, onde connections[i] = [ai, bi] representa uma conexão entre os servidores ai e bi. Qualquer servidor pode alcançar outros servidores diretamente ou indiretamente através da rede.

Um caminho crítico é uma conexão onde, se removida, fará que alguns servidores se tornem incomunicáveis com alguns outros servidores.

Informe todos os caminhos críticos na rede em qualquer ordem.

        Entrada:

                n = 4, conexoes = [[0,1],[1,2],[2,0],[1,3]]

        Saída:

                [[1,3]] ou [[3,1]]

        Exemplo 2:

        Entrada:

                n = 2, connections = [[0,1]]

        Saída:

                [[0,1]]

        Restrições:

                2 <= n <= 105
                n - 1 <= connections.length <= 105
                0 <= ai, bi <= n - 1
                ai != bi
                Não existem conexões repetidas

        class Solution {
            public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {

            }
        }

 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}