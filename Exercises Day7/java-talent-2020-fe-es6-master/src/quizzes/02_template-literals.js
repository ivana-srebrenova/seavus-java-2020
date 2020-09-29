import log from './helpers/pretty-log';

function interpolation() {
    // refactor this to a single template literal using interpolation
    // template literals use backticks instead of double/single quote
    // interpolation is done with ${variable}

    const greeting = 'Hello';
    const noun = 'World';
    return greeting.toUpperCase() + ', ' + noun + '!';
}

// log(interpolation())

function multiline() {
    // refactor to a single template literal with multiple lines
    return '\n' + '    this is on a new line\n' + '  ';
}

// log(multiline())






/*
SOLUTIONS ARE BELOW

























 */

function interpolationSOLUTION() {
    // refactor this to a single template literal using interpolation
    // template literals use backticks instead of double/single quote
    // interpolation is done with ${variable}
    const greeting = 'Hello';
    const noun = 'World';
    return `${greeting.toUpperCase()}, ${noun}!`;
}

// log(interpolationSOLUTION())

function multilineSOLUTION() {
    // refactor to a single template literal with multiple lines
    return `
    this is on a new line
  `;
}

// log(multilineSOLUTION())
