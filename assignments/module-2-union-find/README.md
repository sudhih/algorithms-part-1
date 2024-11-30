# Module-2: Union-Find

> _Union-Find_ is a set of algorithms for solving so-called _Dynamic Connectivity_ 
> problem. 

## What are those algorithms?
- Quick Find
- Quick Union
- Weighted Quick Union
- Weighted Quick Union with Path Compression

## Dynamic Connectivity
_Dynamic Connectivity_ is the model of the problem for _Union-Find_. So, here's 
the idea. They're going to have a set of N objects. Doesn't really matter what 
they are. We're going to use the numbers, zero through N to model our objects. 
And then, we have the idea of a connection between two objects. 

And, we'll, postulate(meaning, assume) that there's going to be a command that 
says, connect two objects. Given two objects, provide a connection between them. 
And then key part of the problem is find query or the connected query, which 
just asks, is there a path connecting the two objects.

So, when we say `union(p, q)` we draw a line from `p` to `q`.