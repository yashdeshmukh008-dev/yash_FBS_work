#include <stdio.h>

   /************************************************************* a. mystrcpy ************************************************************/
char *mystrcpy(char *dest, const char *src)
{
    char *p = dest;
    while (*src)
        *p++ = *src++;
    *p = '\0';
    return dest;
}

/************************************************************** b. mystrlen******************************************************** */
int mystrlen(const char *str)
{
    int len = 0;
    while (str[len] != '\0')
        len++;
    return len;
}

/********************************************************************* c. mystrcmp ************************************************/
int mystrcmp(const char *s1, const char *s2)
{
    while (*s1 && (*s1 == *s2))
    {
        s1++;
        s2++;
    }
    return (*s1 - *s2);
}

/******************************************************************** d. mystrcat **********************************************************/
char *mystrcat(char *dest, const char *src)
{
    char *p = dest;
    while (*p)
        p++;
    while (*src)
        *p++ = *src++;
    *p = '\0';
    return dest;
}

/************************************************************ e. mystrncpy ***********************************************************/
char *mystrncpy(char *dest, const char *src, int n)
{
    int i;
    for (i = 0; i < n && src[i]; i++)
        dest[i] = src[i];
    while (i < n)
        dest[i++] = '\0';
    return dest;
}

/****************************************************** f. mystrupper ***********************************************************/
char *mystrupper(char *str)
{
    int i;
    for (i = 0; str[i]; i++)
    {
        if (str[i] >= 'a' && str[i] <= 'z')
            str[i] -= 32;
    }
    return str;
}

/**************************************************** g. mystrlower ********************************************************/
char *mystrlower(char *str)
{
    int i;
    for (i = 0; str[i]; i++)
    {
        if (str[i] >= 'A' && str[i] <= 'Z')
            str[i] += 32;
    }
    return str;
}

/******************************************************************* h. mystrrev ***************************************************/
char *mystrrev(char *str)
{
    int i = 0, j = mystrlen(str) - 1;
    char temp;
    while (i < j)
    {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        i++;
        j--;
    }
    return str;
}

/********************************************************************* i. mystrstr *************************************************/
char *mystrstr(const char *str, const char *sub)
{
    int i, j;
    if (*sub == '\0')
        return (char *)str;

    for (i = 0; str[i]; i++)
    {
        for (j = 0; sub[j] && str[i + j] == sub[j]; j++);
        if (sub[j] == '\0')
            return (char *)(str + i);
    }
    return NULL;
}

/************************************************************** j. mystrcasecmp *******************************************************/
int mystrcasecmp(const char *s1, const char *s2)
{
    while (*s1 && *s2)
    {
        char c1 = *s1;
        char c2 = *s2;

        if (c1 >= 'A' && c1 <= 'Z')
            c1 += 32;
        if (c2 >= 'A' && c2 <= 'Z')
            c2 += 32;

        if (c1 != c2)
            return c1 - c2;

        s1++;
        s2++;
    }

    return *s1 - *s2;
}

/******************************************************** k. mystrchr ******************************************************/
char *mystrchr(const char *str, int ch)
{
    while (*str)
    {
        if (*str == ch)
            return (char *)str;
        str++;
    }
    if (ch == '\0')
        return (char *)str;
    return NULL;
}

/************************************************************** l. mystrrchr **************************************************/
char *mystrrchr(const char *str, int ch)
{
    const char *last = NULL;

    while (*str)
    {
        if (*str == ch)
            last = str;
        str++;
    }

    if (ch == '\0')
        return (char *)str;

    return (char *)last;
}

/********************************************************* m. mystrncmp *************************************************/
int mystrncmp(const char *s1, const char *s2, int n)
{
    int i;
    for (i = 0; i < n; i++)
    {
        if (s1[i] != s2[i] || s1[i] == '\0' || s2[i] == '\0')
            return s1[i] - s2[i];
    }
    return 0;
}

/************************************************************ n. mystrnstr ***************************************************/
char *mystrnstr(const char *str, const char *sub, int n)
{
    int i, j;

    for (i = 0; i < n && str[i]; i++)
    {
        for (j = 0; sub[j] && (i + j) < n && str[i + j] == sub[j]; j++);
        if (sub[j] == '\0')
            return (char *)(str + i);
    }
    return NULL;
}

/******************************************************************** o. mystrncat *************************************************/
char *mystrncat(char *dest, const char *src, int n)
{
    char *p = dest;

    while (*p)
        p++;

    while (*src && n--)
        *p++ = *src++;

    *p = '\0';
    return dest;
}

/****************************************************************** p. mystrncasecmp ***************************************************/
int mystrncasecmp(const char *s1, const char *s2, int n)
{
    int i;
    for (i = 0; i < n; i++)
    {
        char c1 = s1[i];
        char c2 = s2[i];

        if (c1 >= 'A' && c1 <= 'Z')
            c1 += 32;
        if (c2 >= 'A' && c2 <= 'Z')
            c2 += 32;

        if (c1 != c2 || c1 == '\0' || c2 == '\0')
            return c1 - c2;
    }
    return 0;
}



int main()
{
    char str1[100] = "Hello";
    char str2[100] = "World";
    char str3[100];
    char str4[100] = "Hello World";
    char str5[100] = "Programming";

    /*********** mystrcpy************* */
    mystrcpy(str3, str1);
    printf("mystrcpy: %s\n", str3);

}
