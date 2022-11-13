import { createGlobalStyle } from 'styled-components';

const GlobalStyle = createGlobalStyle`
  /* variables */
  html {
    /* font size */
    --x-large: 28px; 
    --large: 20px;
    --medium: 16px;
    --small: 14px;
    --x-small: 12px;

    /* basic color */
    --white: #ffffff;
    --gray-10: #f7f7f7;
    --gray-50: #f2f2f2;
    --gray-100: #f0f0f0;
    --gray-200: #e6e6e6;
    --gray-300: #d6d6d6;
    --gray-400: #c2c2c2;
    --gray-500: #a3a3a3;
    --gray-600: #858585;
    --gray-700: #5c5c5c;
    --gray-800: #333333;
    --gray-900: #141414;
    --black: #000000;

    /* theme color */
    --light-purple: #C7BCDF;
    --purple: #4C0BD1;
    --light-pink: #FFA6C4;
    --pink: #E55989;
    --light-orange: #FFBA74;
    --orange: #FD6F22;
    --header-background-color: #080F34;
    --background-color: #E3E5EB;
  }

  body {
    font-family: 'Noto Sans KR', sans-serif;
  }
`;

export default GlobalStyle;
