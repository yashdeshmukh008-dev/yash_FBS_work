#include <stdio.h>
#include <string.h>

struct Movie
{
    char title[100];
    char director[100];
    int year;
    char genre[50];
};

int main()
{
    struct Movie movies[100];
    int count = 0;
    int choice, i, searchYear;
    char searchTitle[100];

    while (1)
    {
        printf("\n========== MOVIE DATABASE ==========\n");
        printf("1. Add Movie\n");
        printf("2. Display Movies\n");
        printf("3. Search Movie\n");
        printf("4. Update Movie\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
            case 1:
                if (count >= 100)
                {
                    printf("Movie database is full!\n");
                    break;
                }

                printf("\nEnter movie title: ");
                scanf(" %[^\n]", movies[count].title);

                printf("Enter director: ");
                scanf(" %[^\n]", movies[count].director);

                printf("Enter release year: ");
                scanf("%d", &movies[count].year);

                printf("Enter genre: ");
                scanf(" %[^\n]", movies[count].genre);

                count++;

                printf("Movie added successfully!\n");
                break;

            case 2:
                if (count == 0)
                {
                    printf("\nNo movies in database.\n");
                    break;
                }

                printf("\n========== MOVIE LIST ==========\n");

                for (i = 0; i < count; i++)
                {
                    printf("\nMovie %d\n", i + 1);
                    printf("Title       : %s\n", movies[i].title);
                    printf("Director    : %s\n", movies[i].director);
                    printf("Release Year: %d\n", movies[i].year);
                    printf("Genre       : %s\n", movies[i].genre);
                }
                break;

            case 3:
                printf("\nEnter movie title to search: ");
                scanf(" %[^\n]", searchTitle);

                for (i = 0; i < count; i++)
                {
                    if (strcmp(movies[i].title, searchTitle) == 0)
                    {
                        printf("\nMovie Found!\n");
                        printf("Title       : %s\n", movies[i].title);
                        printf("Director    : %s\n", movies[i].director);
                        printf("Release Year: %d\n", movies[i].year);
                        printf("Genre       : %s\n", movies[i].genre);
                        break;
                    }
                }

                if (i == count)
                {
                    printf("Movie not found.\n");
                }
                break;

            case 4:
                printf("\nEnter movie title to update: ");
                scanf(" %[^\n]", searchTitle);

                for (i = 0; i < count; i++)
                {
                    if (strcmp(movies[i].title, searchTitle) == 0)
                    {
                        printf("\nEnter new director: ");
                        scanf(" %[^\n]", movies[i].director);

                        printf("Enter new release year: ");
                        scanf("%d", &movies[i].year);

                        printf("Enter new genre: ");
                        scanf(" %[^\n]", movies[i].genre);

                        printf("Movie updated successfully!\n");
                        break;
                    }
                }

                if (i == count)
                {
                    printf("Movie not found.\n");
                }
                break;

            case 5:
                printf("\nExiting program...\n");
                return 0;

            default:
                printf("\nInvalid choice! Please try again.\n");
        }
    }

    return 0;
}
