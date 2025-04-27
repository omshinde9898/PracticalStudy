import xmlrpc.client

# Create an XML-RPC client
with xmlrpc.client.ServerProxy("http://localhost:8000/RPC2") as proxy:
    try:
        # Input two strings from the user
        str1 = input("Enter the first string: ")
        str2 = input("Enter the second string: ")

        # Call the concatenate_strings method on the server
        result = proxy.concatenate_strings(str1, str2)

        # Output the result
        print(f"The concatenated string is: {result}")
        
    except Exception as e:
        print(f"Error: {e}")
