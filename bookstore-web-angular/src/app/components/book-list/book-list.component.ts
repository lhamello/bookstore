import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  books: Book[] = [
    {
      sku: "text-100",
      name: "C# Crash Course",
      description: "Learn C# Programming Language",
      unitPrice: 900,
      imageUrl: "assets/images/books/text-101.png",
      active: true,
      unitInStock: 100,
      createdOn: new Date(),
      updatedOn: null
    },
    {
      sku: "text-102",
      name: "C++ Crash Course",
      description: "Learn C++ Programming Language",
      unitPrice: 700,
      imageUrl: "assets/images/books/text-102.png",
      active: true,
      unitInStock: 100,
      createdOn: new Date(),
      updatedOn: null
    },
    {
      sku: "text-103",
      name: "Java Crash Course",
      description: "Learn Java Programming Language",
      unitPrice: 1500,
      imageUrl: "assets/images/books/text-103.png",
      active: true,
      unitInStock: 100,
      createdOn: new Date(),
      updatedOn: null
    }
  ]

  constructor() { }

  ngOnInit(): void {
  }

}
