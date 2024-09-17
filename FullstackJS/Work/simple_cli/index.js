#!/usr/bin/env node

import process from 'node:process';

// Extract command-line arguments, skipping the first two elements
const args = process.argv.slice(2);

if (args.includes('--greet')) {
  console.log('Hello, World!');
} else if (args.includes('--help')) {
  console.log(`
  Usage: 
    --greet     Print 'Hello, World!'
    --help      Show this help message
  `);
} else {
  console.log(`
  No valid arguments provided. Use --help for usage information.
  `);
}