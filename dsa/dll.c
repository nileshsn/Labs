#include<stdio.h>
#include<stdlib.h>
int i,choice,pos,count=0;
void insert_beg();
void insert_pos();
void insert_end();
void delete_beg();
void delete_pos();
void delete_end();

void display();
struct node
{
    int data;
    struct node *next;
    struct node *prev;
}*head,*new,*ptr,*ptr1,*ptr2;
int choice;
void main()
{
 printf("***menu***");
    printf("\n1.insert_beg\n2.insert_pos\n3.insert_end\n4.delete_beg\n5.delete_pos\n6.delete_end\n7.display\n8.exit\n");
    
    while(1)
    {
        
        printf("\nenter main menu choice: ");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:insert_beg();
            break;
            case 2:insert_pos();
            break;
            case 3:insert_end();
            break;
            case 4:delete_beg();
            break;
            case 5:delete_pos();
            break;
            case 6:delete_end();
            break;
            case 7:display();
            break;
            case 8:exit(0);
            default:printf("\nwrong choice");

        }
    }

}
void insert_beg()
{
    new=malloc(sizeof(struct node));
    printf("\nenter the item to be inserted: ");
    scanf("%d",&new->data);
    ptr=head;
    if(head==NULL)
    {
        new->next=NULL;
        new->prev=NULL;
        head=new;
        count++;
    } 
    else
    {
            new->next=ptr;
            ptr->prev=new;
            new->prev=NULL;
            head=new; 
            count++;
    }
}
        void insert_pos()

        {
            printf("\nenter the pos to place an item: ");
            scanf("%d",&pos);
            if(pos==1)
            {
                insert_beg();
            }
            else if(pos<=count)
            {
                ptr=head;
                 new=malloc(sizeof(struct node));
                 printf("\nenter the item to be inserted: ");
                scanf("%d",&new->data);
             for(i=1;i<pos-1;i++)
            {
                ptr=ptr->next;

            }
                ptr1=ptr->next;
                new->next=ptr1;
                ptr1->prev=new;
                new->prev=ptr;
                ptr->next=new;
                count++;

            }
            else{
                printf("invalid");
            }

        }

    
        void insert_end()
        {

                ptr=head;
                 new=malloc(sizeof(struct node));
                 printf("\nenter the item to be inserted: ");
                scanf("%d",&new->data);
                while(ptr->next!=NULL)
                {
                    ptr=ptr->next;
                }
                new->next=NULL;
                ptr->next=new;
                new->prev=ptr;
                count++;

        }
void delete_beg()
{
    ptr=head;
    if(ptr==NULL)
    {
        printf("list is empty");
    }
    else if(ptr->next==NULL)
    {
        head=NULL;
        free(ptr);
        count--;
    }
    else
    {
        ptr1=ptr->next;
        ptr1->prev=NULL;
        head=ptr1;
        free(ptr);
        count--;

    }
}
    void delete_pos()
    {
        ptr=head;
        printf("enter the pos:");
        scanf("%d",&pos);
        if(pos==1)
        {
            delete_beg();
        }
       else if(pos<count)
        {
            ptr=head;
            for(i=1;i<pos-1;i++)
            {
                ptr=ptr->next;
            }
            ptr1=ptr->next;
            ptr2=ptr1->next;
            ptr->next=ptr2;
            ptr2->prev=ptr;
            free(ptr1);
            count--;
        }
        else if(pos==count)
        {
            delete_end();
        }
        else
            printf("Invalid pos");

    }
    void delete_end()
    {
        ptr=head;
        if(ptr==NULL)
        {
            printf("list is empty\n");
        }
        else if(ptr->next==NULL)
        {
            head==NULL;
            free(ptr);
            count--;
        }
        else
        {
         
            while(ptr->next!=NULL)
            {
                ptr=ptr->next;
            }
            ptr1=ptr->prev;
            ptr1->next=NULL;
            free(ptr);
            count--;

        }
    }

        
void display()
{
    ptr=head;
    if(ptr==NULL)
    {
        printf("list is empty");
    }
    else
    {
        while(ptr!=NULL)
        {
        
        printf("%d  ",ptr->data);
        ptr=ptr->next;
        }

    }
}

