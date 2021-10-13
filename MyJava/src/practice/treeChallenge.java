package practice;

public class treeChallenge {

        private treeChallenge leftChild, rightChild;

        public treeChallenge(treeChallenge leftChild, treeChallenge rightChild) {
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        public treeChallenge getLeftChild() {
            return this.leftChild;
        }

        public treeChallenge getRightChild() {
            return this.rightChild;
        }

        public int maxDepth() {
            return 0;
        }

        public static void main(String[] args) {
            treeChallenge leaf1 = new treeChallenge(null, null);
            treeChallenge leaf2 = new treeChallenge(null, null);
            treeChallenge node = new treeChallenge(leaf1, null);
            treeChallenge root = new treeChallenge(node, leaf2);

            System.out.println(root.maxDepth());
        }
}
