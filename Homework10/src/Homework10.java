/**
 * Created by Iris on 11/22/2014.
 */
/*
Part 1
1)
                       O
                 /            \
               O               O
             /   \           /   \
           O       O       O       O
         /  \    /  \    /  \    /  \
       O     O O     O O     O O     O

    Answer these questions for a binary tree with four levels. Then answer them for a binary tree with eight levels.
    a) What is the maximum number of nodes in the tree?
        15 Nodes
    b) What is the maximum number of leaves in the tree?
        8 Leaves

2)  Consider binary the tree below.

                       5
                 /            \
               12              11
             /   \           /   \
          1O      13      19       2
         /  \       \    /       /  \
       6     8       9  7      1     4

    a) What is the preorder traversal?
        5, 12, 10,  6,  8, 13,  9, 11, 19,  7, 2, 1, 4
    b) What is the postorder traversal?
        6,  8, 10, 12,  9, 13,  5,  7, 19, 11, 1, 4, 2
    c) What is the inorder traversal?
        6, 10,  8, 12, 13,  9,  5, 11, 19,  7, 2, 1, 4

3) For each tree below, answer these questions.

      Tree A
                      22
                 /            \
              21              20
             /   \           /   \
          14      16       11      13
         /  \    /  \
      12     9  14  17

      Tree B
                       7
                 /            \
               5               9
             /   \           /   \
           3       6       8      11
         /  \               \       \
       2     4              1O      12

    a) Is the tree a binary tree? Why or why not?
        Tree A & B: Yes. Each Node has at most 2 children
    b) Is the tree a binary search tree? Why or why not?
        Tree A: No. Both of 20's children are less than 20 instead of being right < 20 < left
        Tree B: Yes. All nodes follow rightChild < parent < leftChild structure
    c) Is the tree a max heap? Why or why not?
        Tree A: No. In the last level, one of 16's children is greater than 16
        Tree B: No. All of the parents have children greater than them.

4)
    Draw the shortest possibly binary search tree from the following Strings.
    (The elements below are the contents of the tree, not the insertion order.)

    apple banana cauliflower eggplant figs kale lettuce mushrooms onion pear quince radish squash yam

    Is your tree unique?

      String Tree
                                         mushrooms
                             /                                \
                      eggplant                              radish
                /                  \                    /          \
           banana                 kale               pear         squash
           /      \             /      \           /    \        /
       apple  cauliflower    figs    lettuce   onion   quince  yam

        No. This tree is not unique because there is no specified insertion order.

5)
    Draw a maxheap from the Strings in Question 4. Is your maxheap unique?

                                          yam
                             /                                \
                      radish                               squash
                /                  \                    /          \
           quince                pear               onion        mushrooms
           /      \             /      \           /    \        /
      lettuce    kale        figs   eggplant   banana  apple   cauliflower
    No because, although it is a maxheap, there is no specified
    insertion order of which has to be on left or right.

6) *Extra Credit*
    The preorder traversal of a binary search tree is given.
    What is the postorder traversal of the tree?

    17  13  7  15  14  18  22  21  23

                     17
                 /         \
               13           22
             /   \        /   \
           7     15     21    23
                /   \
              14    18

    Postorder Traversal: 7, 13, 14, 18, 15, 17, 21, 23, 22

Part 2
    Chapter 20, Page 596/Chapter 26, Page 692 (Tree Implementations): 7a, 10a;
    Extra Credit: 11a and 12 (custom edition)/12a and 13 (2nd edition)



*/
