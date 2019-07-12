# Building a Java Project by Gradle

## Business Requirement

Get to know what is Gradle and build a java project with Gradle step by step and then use gradle add new java library dependence to your project.

## Practice Requirement
1. Use Gradle command line to build Java project 
2. Use Gradle to compile Javap project
3. Use Gradle run automatic test
4. Use Gradle to add ideaplug-in, and generate Intellj Idea project files
5. Use Gradle to run program to output "This is a Gradle Project" to command line
6. Add Mockito dependence and simply use Mockito in test method to get test passed 
```
    @Test
    public void testMockClass() throws Exception {
        // you can mock concrete classes, not only interfaces
        LinkedList mockedList = mock(LinkedList.class);

        // stubbing appears before the actual execution
        String value = "first";
        when(mockedList.get(0)).thenReturn(value);

        assertEquals(mockedList.get(0), value);

    }
```

## Practice Output
- Please push the gradle project to your Github
- Commit your repostory link to complete this Question..

