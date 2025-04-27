from xmlrpc.server import SimpleXMLRPCServer

# Function to concatenate two strings
def concatenate_strings(str1, str2):
    return str1 + str2

# Create and start the server
server = SimpleXMLRPCServer(('localhost', 8000))
server.register_function(concatenate_strings, 'concatenate_strings')

print("Server is ready to accept requests.")
server.serve_forever()
