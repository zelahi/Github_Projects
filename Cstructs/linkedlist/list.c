#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

#include "list.h"

typedef struct node {
	int data;
	struct node *next;
};

struct *node_t head = NULL;
struct *node_t curr = NULL;

/* Creates a node to insert into a linked list
 *
 *@param data - data being added to the linked list
 */
struct node* create_node(int data) {

	printf("Creating a node to add to the linked list");
	struct node *node_ptr = (struct node_ptr*)malloc(sizeof(struct *node_t));

	//exit out if node value is null
	if(node_ptr == NULL){
		printf("\n Failed to create node\n");
		return 0;
	}

	//set the values of the node
	node_ptr -> data = data;
	node_ptr -> next = NULL;

	return node_ptr;
	
}

/*  Adds an item to a list
 *
 * @param data - data to be inserted into the list
 * @param add_to_end - indicates if item should be added to the end or beginning of the list
 * @return returns item added to the list
 */
struct node* add_to_list(int data, bool add_to_end) {
	//creating a new linked list
	if(head == NULL) {
		return create_node(data);
	}

	struct test_struct *node_ptr = (struct test_struct*)malloc(sizeof(struct test_struct));
	if(node_ptr == NULL)
		printf("/n Failed to create node/n");

	node_ptr -> data = data;
	node_ptr -> next = NULL;

	if(add_to_end) {
		printf("Adding item to the end of the list");
		curr -> next = node_ptr;
		curr = node_ptr;
		
	} else {
		printf("Adding item to the beginning of the list");
		node_ptr -> next = head;
		head = node_ptr;
	}

	return node_ptr;



}
